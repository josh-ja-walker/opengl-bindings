import scala.util.matching.Regex
import bindgen.plugin.BindgenMode
import bindgen.interface.Binding

//TODO: support different OSes by modifying linkflags
import com.indoorvivants.detective.Platform
import com.indoorvivants.detective.Platform.OS.* 


Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / resolvers += Resolver.sonatypeCentralSnapshots

/* Global project settings */
ThisBuild / scalaVersion := "3.8.1"


lazy val `opengl-bindings` = project
    .in(file("."))
    .aggregate(glad, glfw)  
    .dependsOn(glad, glfw)
    .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
    .settings(
        nativeConfig := nativeConfig.value
            .withCompileOptions(_ ++ vcpkgConfigurator.value.pkgConfig.compilationFlags("glfw3"))
            .withLinkingOptions(_ ++ vcpkgConfigurator.value.pkgConfig.linkingFlags("glfw3"))
            .withLinkingOptions(_ :+ "-lshell32")
    )
    
    
lazy val bindgenSettings = Seq(
    bindgenBindings := {
        bindgenBindings.value.map(_.withNoLocation(true).withMultiFile(true)) 
    },
    bindgenMode := BindgenMode.Manual(
        scalaDir = (Compile / sourceDirectory).value / "scala" / "generated" / "libraries",
        cDir = (Compile / resourceDirectory).value / "scala-native" / "generated" / "libraries"
    )
)


glad / clean := {
    val cDir = (glad / Compile / resourceDirectory).value / "scala-native" / "generated"
    val scalaDir = (glad / Compile / sourceDirectory).value / "scala" / "generated"
    IO.delete(cDir)
    IO.delete(scalaDir)
}

glfw / clean := {
    val cDir = (glfw / Compile / resourceDirectory).value / "scala-native" / "generated"
    val scalaDir = (glfw / Compile / sourceDirectory).value / "scala" / "generated"
    IO.delete(cDir)
    IO.delete(scalaDir)
}


lazy val gen = taskKey[Unit]("Generate OpenGL bindings and forwarders")
glad / gen := {
    (glad / clean).value
    (glad / genBindings).value
    (glad / genForwarders).value
}

glfw / gen := {
    (glfw / clean).value
    (glfw / genBindings).value
    (glfw / genForwarders).value
}


//TODO: Neaten?
lazy val genBindings = taskKey[Unit]("Generate OpenGL bindings")
glad / genBindings := {
    val bindings = (glad / Compile / bindgenGenerateScalaSources).value
    removeOpaqueness(bindings)

    val libDir = (glad / Compile / sourceDirectory).value / "scala" / "generated" / "libraries"   
    IO.delete(libDir / "glad")
    IO.move(libDir / "opengl.bindings.glad", libDir / "glad")
}

glfw / genBindings := {
    (glfw / clean).value

    val bindings = (glfw / Compile / bindgenGenerateScalaSources).value
    removeOpaqueness(bindings)
    
    val libDir = (glfw / Compile / sourceDirectory).value / "scala" / "generated" / "libraries"   
    IO.delete(libDir / "glfw")
    IO.move(libDir / "opengl.bindings.glfw", libDir / "glfw")
}

def removeOpaqueness(bindings: Seq[File]) = {
    bindings.filter(_.name == "aliases.scala")
        .foreach(binding => {
            val content: String = IO.read(binding)
            // Remove opaque modifier from file 
            IO.write(binding, content.replace("opaque ", new String()))
        })
}


lazy val genForwarders = taskKey[Seq[File]]("Generate C and Scala forwarders for C preprocessor constants")
lazy val genCForwarders = taskKey[Seq[File]]("Generate C forwarders for C preprocessor constants")
lazy val genScalaForwarders = taskKey[Seq[File]]("Generate Scala forwarders for C preprocessor constants")


//TODO: move into separate build file
lazy val glad = project
    .in(file("glad"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin)
    .settings(
        bindgenBindings += {
            // TODO: needs glad / Compile / ...?
            val include = (Compile / resourceDirectory).value / "scala-native" / "libraries" / "glad" / "include"
            Binding(include / "glad" / "gl.h", "opengl.bindings.glad")
                .withCImports(List("gl.h", "khrplatform.h"))
                .withClangFlags(List("-I" + include))
        },
        
        nativeConfig := {
            //TODO: needs glad / Compile / ...??
            val gladBase = (Compile / resourceDirectory).value / "scala-native" / "libraries" / "glad"
            val compFlags = List(s"-I${gladBase / "include"}")
            val linkFlags = List(s"-L$gladBase")
            
            nativeConfig.value
                .withCompileOptions(_ ++ compFlags)
                .withLinkingOptions(_ ++ linkFlags)
        }
    )
    .settings(bindgenSettings)

glad / genForwarders := {
    val cFiles = (glad / genCForwarders).value    
    val scalaFiles = (glad / genScalaForwarders).value    
    cFiles ++ scalaFiles
}

glad / genCForwarders := {
    val headerFile =  (glad / Compile / resourceDirectory).value / "scala-native" / "libraries" / "glad" / "include" / "glad" / "gl.h"
    val headerContents = IO.read(headerFile)

    val constRegex: Regex = raw"#define (GL(_[a-zA-Z0-9]*)+)\s+(\S+)\n".r
    val constForwarders = constRegex.findAllMatchIn(headerContents)
        .map(regexMatch => {
            val const = regexMatch.group(1)
            val value = regexMatch.group(3)
            s"unsigned int CONST_$const() { return $const; } // defined as $value"
        })
        .mkString("\n")

    val funcRegex: Regex = raw"GLAD_API_CALL (PFNGL[A-Z]+PROC) (glad_(gl([A-Z][a-z]*)+));\s*#define \3 \2".r
    val funcForwarders = funcRegex.findAllMatchIn(headerContents)
        .map(regexMatch => {
            val proc = regexMatch.group(1)
            val func = regexMatch.group(3)
            s"$proc func_$func() { return $func; }"
        })
        .mkString("\n")


    val include = s"#include <glad/gl.h>\n"

    val gladDir = (glad / Compile / resourceDirectory).value / "scala-native" / "generated" / "forwarders" / "glad"
    IO.write(gladDir / "const.c", include ++ constForwarders)
    IO.write(gladDir / "func.c", include ++ funcForwarders)

    Seq(gladDir / "const.c", gladDir / "func.c")
}

glad / genScalaForwarders := {
    val headerFile =  (glad / Compile / resourceDirectory).value / "scala-native" / "libraries" / "glad" / "include" / "glad" / "gl.h"
    val headerContents = IO.read(headerFile)

    val packageName = "package opengl.bindings.glad"
    val imports = """
        |
        |import _root_.scala.scalanative.unsafe.*
        |import _root_.scala.scalanative.unsigned.*
        |import _root_.scala.scalanative.libc.*
        |import _root_.scala.scalanative.*
        |
        |
        |""".stripMargin


    val constRegex: Regex = raw"#define (GL(_[a-zA-Z0-9]*)+)\s+(\S+)\n".r
    val constForwarders = constRegex.findAllMatchIn(headerContents)
        .map(regexMatch => {
            val const = regexMatch.group(1)
            val value = regexMatch.group(3)
            s"""@name("CONST_$const") @extern def $const: UInt = extern // defined as $value"""
        })
        .mkString("\n")

    val funcRegex: Regex = raw"GLAD_API_CALL (PFNGL[A-Z]+PROC) (glad_(gl([A-Z][a-z]*)+));\s*#define \3 \2".r
    val funcForwarders = funcRegex.findAllMatchIn(headerContents)
        .map(regexMatch => {
            val proc = regexMatch.group(1)
            val func = regexMatch.group(3)
            s"""@name("func_$func") @extern def $func: $proc = extern"""
        })
        .mkString("\n")


    val gladDir = (glad / Compile / sourceDirectory).value / "scala" / "generated" / "forwarders" / "glad"
    IO.write(gladDir / "constants.scala", packageName ++ imports ++ constForwarders)
    IO.write(gladDir / "glfunctions.scala", packageName ++ imports ++ funcForwarders)

    Seq(gladDir / "constants.scala", gladDir / "glfunctions.scala")
}


//TODO: move into separate build file
lazy val glfw = project
    .in(file("glfw"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
    .settings(
        vcpkgDependencies := VcpkgDependencies("glfw3"),

        bindgenBindings += {
            val include = vcpkgConfigurator.value.includes("glfw3")
            Binding(include / "GLFW" / "glfw3.h", "opengl.bindings.glfw")
                .withCImports(List("glfw3.h", "glfw3native.h"))
                .withClangFlags(List("-I" + include))
        },

        nativeConfig := {
            val compFlags = vcpkgConfigurator.value.pkgConfig.compilationFlags("glfw3")
            val linkFlags = "-lshell32" +: vcpkgConfigurator.value.pkgConfig.linkingFlags("glfw3")
            
            nativeConfig.value
                .withCompileOptions(_ ++ compFlags)
                .withLinkingOptions(_ ++ linkFlags)
        }
    )
    .settings(bindgenSettings)

glfw / genForwarders := {
    val cFiles = (glfw / genCForwarders).value    
    val scalaFiles = (glfw / genScalaForwarders).value    
    cFiles ++ scalaFiles
}

glfw / genCForwarders := {
    val headerFile = (glfw / vcpkgConfigurator).value.includes("glfw3") / "GLFW" / "glfw3.h"
    val headerContents = IO.read(headerFile)

    val constRegex: Regex = raw"#define (GLFW(_[A-Z0-9]*)+)\s+([^#]\S+)".r
    val constForwarders = constRegex.findAllMatchIn(headerContents)
        .map(regexMatch => {
            val const = regexMatch.group(1)
            val value = regexMatch.group(3)
            s"int CONST_$const() { return $const; } // defined as $value"
        })
        .mkString("\n")

    val include = s"#include <GLFW/glfw3.h>\n"

    val glfwDir = (glfw / Compile / resourceDirectory).value / "scala-native" / "generated" / "forwarders" / "glfw"
    IO.write(glfwDir / "const.c", include ++ constForwarders)

    Seq(glfwDir / "const.c")
}

glfw / genScalaForwarders := {
    val headerFile = (glfw / vcpkgConfigurator).value.includes("glfw3") / "GLFW" / "glfw3.h"
    val headerContents = IO.read(headerFile)

    val packageName = "package opengl.bindings.glfw"
    val imports = """
        |
        |import _root_.scala.scalanative.unsafe.*
        |import _root_.scala.scalanative.unsigned.*
        |import _root_.scala.scalanative.libc.*
        |import _root_.scala.scalanative.*
        |
        |
        |""".stripMargin


    val constRegex: Regex = raw"#define (GLFW(_[A-Z0-9]*)+)\s+([^#]\S+)".r
    val constForwarders = constRegex.findAllMatchIn(headerContents)
        .map(regexMatch => {
            val const = regexMatch.group(1)
            val value = regexMatch.group(3)
            s"""@name("CONST_$const") @extern def $const: Int = extern // defined as $value"""
        })
        .mkString("\n")

    val glfwDir = (glfw / Compile / sourceDirectory).value / "scala" / "generated" / "forwarders" / "glfw"
    IO.write(glfwDir / "constants.scala", packageName ++ imports ++ constForwarders)

    Seq(glfwDir / "constants.scala")
}

