import scalanative.unsafe.*
import scala.scalanative.unsafe.Size.*
import scala.scalanative.unsafe.Nat.*
import scala.scalanative.libc.string
import scala.scalanative.libc.stdio

import glfw.*
import glad.*

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

    // Redefine glfwProc as a GLADloadfunc
    val glfwProc = GLADloadfunc((name: CString) => GLADapiproc(glfwGetProcAddress(name).value))

    // Start GLAD with GLFW linked to call OpenGL functions.
    val version_glad = gladLoadGL(glfwProc)
    if (version_glad == 0) {
        Console.err.println("ERROR: Failed to initialize OpenGL context.")
        return -1
    }

    // Print versions used by OpenGL instance
    println(s"Renderer: ${fromCString(glGetString(GL_RENDERER).asInstanceOf[Ptr[CChar]])}")
    println(s"OpenGL version supported: ${fromCString(glGetString(GL_VERSION).asInstanceOf[Ptr[CChar]])}")
    
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
        val vs: GLuint = glCreateShader(GL_VERTEX_SHADER)
        glShaderSource(vs, GLsizei(1), vsPtr, null)
        glCompileShader(vs)


        // Define fragment shader - interpolates vertex colour
        val fragment_shader: String = """
            |#version 410 core
            |in vec4 vertex_color;
            |out vec4 frag_color;
            |void main() {;
            |  frag_color = vertex_color;
            |}""".stripMargin
        
        val fsPtr: Ptr[CString] = alloc[CString](sizeOf[CString])
        !fsPtr = toCString(fragment_shader)

        // Link and compile fragment shader
        val fs: GLuint = glCreateShader(GL_FRAGMENT_SHADER)
        glShaderSource(fs, GLsizei(1), fsPtr, null)
        glCompileShader(fs)

        val shader_program: GLuint = glCreateProgram()
        glAttachShader(shader_program, fs)
        glAttachShader(shader_program, vs)
        glLinkProgram(shader_program)
        
        
        // Define points of triangle
        val points: Seq[GLfloat] = Seq(
            -1.0f, -1.0f, 0.0f, // x,y,z of first point.
             1.0f, -1.0f, 0.0f, // x,y,z of second point.
             0.0f,  1.0f, 0.0f  // x,y,z of third point.
        ).map(khronos_float_t.apply andThen GLfloat.apply)

        // Copy points into an array
        // TODO: likely possible to improve this
        val pointsPtr: Ptr[GLfloat] = alloc[GLfloat](points.length)
        points.zipWithIndex.foreach((v, i) => pointsPtr(i) = v)

        
        // Initialise vertex buffer
        val vbo: Ptr[GLuint] = alloc[GLuint]()
        !vbo = GLuint(0.toUInt)

        glGenBuffers(GLsizei(1), vbo)
        glBindBuffer(GL_ARRAY_BUFFER, !vbo)
        glBufferData(GL_ARRAY_BUFFER, khronos_ssize_t(points.length * sizeOf[GLfloat]), pointsPtr.asInstanceOf[Ptr[Byte]], GL_STATIC_DRAW)
        

        // Initialise vertex array
        val vao: Ptr[GLuint] = alloc[GLuint]()
        !vao = GLuint(0.toUInt)
        
        glGenVertexArrays(GLsizei(1), vao)
        glBindVertexArray(!vao)
        glEnableVertexAttribArray(GLuint(0.toUInt))
        glBindBuffer(GL_ARRAY_BUFFER, !vbo)
        glVertexAttribPointer(GLuint(0.toUInt), GLint(3), GL_FLOAT, glad.GL_FALSE, GLsizei(0), null)
        

        // Set background colour to black rgba(0, 0, 0, 1)
        glClearColor(GLfloat(khronos_float_t(0f)), GLfloat(khronos_float_t(0f)), GLfloat(khronos_float_t(0f)), GLfloat(khronos_float_t(1.0f)));

        // Until window closed by user input
        while (glfwWindowShouldClose(window) == glfw.GL_FALSE) {
            // Update window events
            glfwPollEvents()

            // Clear window
            glClear(GLbitfield(GL_COLOR_BUFFER_BIT.value | GL_DEPTH_BUFFER_BIT.value))
    
            // Bind shader and vertex to OpenGL state machine
            glUseProgram(shader_program)
            glBindVertexArray(!vao)
            
            // Draw points 0-3 from bound vertex array
            glDrawArrays(GL_TRIANGLES, GLint(0), GLsizei(3))
            
            // Copy buffers into window to render
            glfwSwapBuffers(window)
        }
    }

    println("SUCCESS: started GLFW3.")

    // Close OpenGL window and context
    glfwTerminate()
    return 0
}
