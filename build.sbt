import bindgen.plugin.BindgenMode
import com.indoorvivants.detective.Platform.OS.*
import com.indoorvivants.detective.Platform
import bindgen.interface.Binding


Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / resolvers += Resolver.sonatypeCentralSnapshots

scalaVersion := "3.8.0"

val opengl = project
    .in(file("opengl"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
    .settings(
        scalaVersion := "3.8.0",
        vcpkgDependencies := VcpkgDependencies("glfw3"),

        bindgenBindings += {
            val include = (Compile / resourceDirectory).value / "scala-native" / "glad" / "include"
            Binding(include / "glad" / "gl.h", "glad")
                .withCImports(List("gl.h", "khrplatform.h"))
                .withClangFlags(List("-I" + include))
        },

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
    .settings(configurePlatform())



def configurePlatform(rename: String => String = identity) = Seq(
    nativeConfig := {
        val arch64 =
            if (Platform.arch == Platform.Arch.Arm && Platform.bits == Platform.Bits.x64) 
                List("-arch", "arm64")
            else 
                Nil

        nativeConfig.value
            .withLinkingOptions(_ ++ arch64)
            .withCompileOptions(_ ++ arch64)
    }
)
