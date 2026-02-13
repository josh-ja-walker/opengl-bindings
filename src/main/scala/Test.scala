import scalanative.unsafe.*
import scalanative.unsigned.*

import glfw.*
import glad.*
import conversions.UBytePtr.*


@main def main: Int = {
    // Start OpenGL context using the GLFW helper library.
    if (glfwInit() == 0) {
        Console.err.println("ERROR: could not initialise GLFW3.")
        return -1
    }

    // Request an OpenGL 4.6, core, context from GLFW.
    glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 4)
    glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 6)
    glfwWindowHint(GLFW_OPENGL_FORWARD_COMPAT, glfw.GL_TRUE)
    glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE)
    
    // Create window
    val window: Ptr[GLFWwindow] = glfwCreateWindow(800, 600, c"Hello Triangle", null, null)
    if (window == null) {
        Console.err.println("ERROR: Could not open window with GLFW3.")
        glfwTerminate()
        return -1
    }

    glfwMakeContextCurrent(window)

    // Start GLAD with GLFW linked to call OpenGL functions.
    val version_glad = gladLoadGL(glfwGetProcAddress)
    if (version_glad == 0) {
        Console.err.println("ERROR: Failed to initialize OpenGL context.")
        return -1
    }

    // Print versions used by OpenGL instance
    println(s"Renderer: ${fromCString(glGetString(GL_RENDERER).toCharPtr)}")
    println(s"OpenGL version supported: ${fromCString(glGetString(GL_VERSION).toCharPtr)}")
    

    Zone {
        // Define vertex shader - set rgb values at vertices
        val vertex_shader: String = """
            |#version 410 core
            |in vec3 vp;
            |out vec4 vertex_color;
            |vec4 colors[3] = vec4[3](
            |    vec4(1, 0, 0, 1),
            |    vec4(0, 1, 0, 1),
            |    vec4(0, 0, 1, 1)
            |);
            |void main() {
            |  gl_Position = vec4( vp, 1.0 );
            |  vertex_color = colors[gl_VertexID];
            |}""".stripMargin
    

        val vsPtr: Ptr[CString] = alloc[CString](sizeOf[CString])
        !vsPtr = toCString(vertex_shader)
        
        // Link and compile vertex shader
        val vs: UInt = glCreateShader.apply(GL_VERTEX_SHADER)
        glShaderSource(vs, 1, vsPtr, null)
        glCompileShader(vs)


        // Define fragment shader - interpolates vertex colour
        val fragment_shader: String = """
            |#version 410 core
            |in vec4 vertex_color;
            |out vec4 frag_color;
            |void main() {
            |  frag_color = vertex_color;
            |}""".stripMargin
        
        val fsPtr: Ptr[CString] = alloc[CString](sizeOf[CString])
        !fsPtr = toCString(fragment_shader: String)

        // Link and compile fragment shader
        val fs: UInt = glCreateShader(GL_FRAGMENT_SHADER)
        glShaderSource(fs, 1, fsPtr, null)
        glCompileShader(fs)

        val shader_program: UInt = glCreateProgram()
        glAttachShader(shader_program, fs)
        glAttachShader(shader_program, vs)
        glLinkProgram(shader_program)


        val points: Array[Float] = Array(
            -1.0f, -1.0f, 0.0f, // x,y,z of first point.
             1.0f, -1.0f, 0.0f, // x,y,z of second point.
             0.0f,  1.0f, 0.0f  // x,y,z of third point.
        )

        val pointsPtr: Ptr[Byte] = points.at(0).asInstanceOf[Ptr[Byte]]


        // Initialise vertex buffer
        val vbo: Ptr[UInt] = alloc[UInt]()  
        !vbo = 0.toUInt

        glGenBuffers(1, vbo)
        glBindBuffer(GL_ARRAY_BUFFER, !vbo)
        glBufferData(GL_ARRAY_BUFFER, khronos_ssize_t(points.length * sizeOf[Float]), pointsPtr, GL_STATIC_DRAW)


        // Initialise vertex array
        val vao: Ptr[UInt] = alloc[UInt]()
        !vao = 0.toUInt
        
        glGenVertexArrays(1, vao)
        glBindVertexArray(!vao)
        glEnableVertexAttribArray(0.toUInt)
        glBindBuffer(GL_ARRAY_BUFFER, !vbo)
        glVertexAttribPointer(0.toUInt, 3, GL_FLOAT, glad.GL_FALSE, 0, null)


        // Set background colour to black rgba(0, 0, 0, 1)
        glClearColor(0f, 0f, 0f, 1.0f)

        // Until window closed by user input
        while (glfwWindowShouldClose(window) == glfw.GL_FALSE) {
            // Update window events
            glfwPollEvents()

            // Clear window
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)
    
            // Bind shader and vertex to OpenGL state machine
            glUseProgram(shader_program)
            glBindVertexArray(!vao)
            
            // Draw points 0-3 from bound vertex array
            glDrawArrays(GL_TRIANGLES, 0, 3)
            
            // Copy buffers into window to render
            glfwSwapBuffers(window)
        }
    }

    println("SUCCESS: started GLFW3.")

    // Close OpenGL window and context
    glfwTerminate()
    return 0
}
