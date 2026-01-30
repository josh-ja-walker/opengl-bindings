import bindgen.plugin.BindgenMode
import bindgen.interface.Binding

//TODO: support different OSes by modifying linkflags
import com.indoorvivants.detective.Platform
import com.indoorvivants.detective.Platform.OS.* 


Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / resolvers += Resolver.sonatypeCentralSnapshots

lazy val Versions = new {
    val OpenGLBindings = "0.1.0"
    // val GLAD = "0.7.0" 
    // val GLFW3 = "0.7.0"
    val Scala = "3.8.1"
}

/* Global project settings */
inThisBuild(List(
    scalaVersion := Versions.Scala,
    version := Versions.OpenGLBindings,
    versionScheme := Some("early-semver"),
    organization := "com.github.josh-ja-walker",
    organizationName := "Josh Walker",
    startYear := Some(2026),
    developers := List(
        Developer("josh-ja-walker", "Josh Walker", "", url("https://github.com/josh-ja-walker")),
    ),
    licenses := List("BSD-3-Clause" -> url("https://opensource.org/licenses/BSD-3-Clause")),
))


lazy val openglBindings = project
    .in(file("."))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
    .settings(
        name := "opengl-bindings",
        bindgenBindings += {
            val include = (Compile / resourceDirectory).value / "scala-native" / "glad" / "include"
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
            //TODO: export to library with .withExport(true)
            bindgenBindings.value.map(_.withNoLocation(true).withMultiFile(true)) 
        },

        bindgenMode := BindgenMode.Manual(
            scalaDir = (Compile / sourceDirectory).value / "scala" / "generated",
            cDir = (Compile / resourceDirectory).value / "scala-native" / "generated"
        ),

        nativeConfig := {
            val gladBase = (Compile / resourceDirectory).value / "scala-native" / "glad"

            val pkgs = Seq("glfw3")
            val pkgConfig = vcpkgConfigurator.value.pkgConfig

            // TODO: maybe include "-lglad", "-lgdi32"
            val compflags = pkgs.flatMap(pkg => pkgConfig.compilationFlags(pkg)) ++ List("-D GLFW_DLL", ("-I" + (gladBase / "include").toString), "-L" + gladBase.toString)
            val linkflags = pkgs.flatMap(pkg => pkgConfig.linkingFlags(pkg)) ++ List("-lshell32", "-lopengl32",  "-L" + (gladBase.toString))

            nativeConfig.value
                .withCompileOptions(_ ++ compflags)
                .withLinkingOptions(_ ++ linkflags)
        },
    )
