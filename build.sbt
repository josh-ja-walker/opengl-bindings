import bindgen.plugin.BindgenMode
import bindgen.interface.Binding

//TODO: support different OSes by modifying linkflags
import com.indoorvivants.detective.Platform
import com.indoorvivants.detective.Platform.OS.* 


Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / resolvers += Resolver.sonatypeCentralSnapshots

/* Global project settings */
ThisBuild / scalaVersion := "3.8.1"

lazy val genBindings = taskKey[Seq[File]]("Generate OpenGL bindings")
genBindings := (Compile / bindgenGenerateScalaSources).value
    .map(binding => {
        if (binding.name == "aliases.scala") {
            val content: String = IO.read(binding)
            // Remove opaque modifier from file 
            IO.write(binding, content.replace("opaque ", new String()))
        }

        binding
    })


lazy val `opengl-bindings` = project
    .in(file("."))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
    .settings(
        bindgenBindings += {
            val include = (Compile / resourceDirectory).value / "scala-native" / "libraries" / "glad" / "include"
            Binding(include / "glad" / "gl.h", "glad")
                .withCImports(List("gl.h", "khrplatform.h"))
                .withClangFlags(List("-I" + include))
        },

        vcpkgDependencies := VcpkgDependencies("glfw3"),
        bindgenBindings += {
            val include = vcpkgConfigurator.value.includes("glfw3")
            Binding(include / "GLFW" / "glfw3.h", "glfw")
                .withCImports(List("glfw3.h", "glfw3native.h"))
                .withClangFlags(List("-I" + include))
        },

        bindgenBindings := {
            bindgenBindings.value.map(_.withNoLocation(true).withMultiFile(true)) 
        },

        bindgenMode := BindgenMode.Manual(
            scalaDir = (Compile / sourceDirectory).value / "scala" / "generated",
            cDir = (Compile / resourceDirectory).value / "scala-native" / "generated"
        ),

        nativeConfig := {
            val gladBase = (Compile / resourceDirectory).value / "scala-native" / "libraries" / "glad"
            val gladCompFlags = List("-I" + (gladBase / "include").toString)
            val gladLinkFlags = List("-L" + (gladBase.toString))

            val glfwCompFlags = vcpkgConfigurator.value.pkgConfig.compilationFlags("glfw3")
            val glfwLinkFlags = "-lshell32" +: vcpkgConfigurator.value.pkgConfig.linkingFlags("glfw3")
            
            nativeConfig.value
                .withCompileOptions(_ ++ gladCompFlags ++ glfwCompFlags)
                .withLinkingOptions(_ ++ gladLinkFlags ++ glfwLinkFlags)
        },
    )