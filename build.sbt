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

lazy val gen = taskKey[Seq[File]]("Generate OpenGL bindings and forwarders")
gen := {
    genBindings.value
    (glad / genForwarders).value
    (glfw / genForwarders).value
}


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



lazy val genForwarders = taskKey[Seq[File]]("Generate C and Scala forwarders for C preprocessor constants")
lazy val genCForwarders = taskKey[Seq[File]]("Generate C forwarders for C preprocessor constants")
lazy val genScalaForwarders = taskKey[Seq[File]]("Generate Scala forwarders for C preprocessor constants")

lazy val glad = project.in(file("glad"))

glad / genForwarders := {
    val cFiles = (glad / genCForwarders).value    
    val scalaFiles = (glad / genScalaForwarders).value    
    cFiles ++ scalaFiles
}

glad / genCForwarders := {
    val headerFile =  (glad / Compile / resourceDirectory).value / "scala-native" / "libraries" / "glad" / "include" / "glad" / "gl.h"
    val headerContents = IO.read(headerFile)

    val constRegex: Regex = raw"#define (GL(_[A-Z0-9]*)+)".r
    val constForwarders = constRegex.findAllMatchIn(headerContents)
        .map(regexMatch => {
            val const = regexMatch.group(1)
            s"unsigned int CONST_$const() { return $const; }"
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

    val packageName = "package glad"
    val imports = """
        |import _root_.scala.scalanative.unsafe.*
        |import _root_.scala.scalanative.unsigned.*
        |import _root_.scala.scalanative.libc.*
        |import _root_.scala.scalanative.*
        |
        |""".stripMargin


    val constRegex: Regex = raw"#define (GL(_[A-Z0-9]*)+)".r
    val constForwarders = constRegex.findAllMatchIn(headerContents)
        .map(regexMatch => {
            val const = regexMatch.group(1)
            s"""@name("CONST_$const") @extern val $const: UInt = extern"""
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
    IO.write(gladDir / "functions.scala", packageName ++ imports ++ funcForwarders)

    Seq(gladDir / "constants.scala", gladDir / "functions.scala")
}


lazy val glfw = project
    .in(file("glfw"))
    .enablePlugins(VcpkgNativePlugin)
    .settings(Seq(
        vcpkgDependencies := VcpkgDependencies("glfw3")
    ))

glfw / genForwarders := {
    val cFiles = (glfw / genCForwarders).value    
    val scalaFiles = (glfw / genScalaForwarders).value    
    cFiles ++ scalaFiles
}

glfw / genCForwarders := {
    val headerFile = vcpkgConfigurator.value.includes("glfw3") / "GLFW" / "glfw3.h"
    val headerContents = IO.read(headerFile)

    val constRegex: Regex = raw"#define (GLFW(_[A-Z0-9]*)+)\s+\S+\n".r
    val constForwarders = constRegex.findAllMatchIn(headerContents)
        .map(regexMatch => {
            val const = regexMatch.group(1)
            s"unsigned int CONST_$const() { return $const; }"
        })
        .mkString("\n")

    val include = s"#include <GLFW/glfw3.h>\n"

    val glfwDir = (glfw / Compile / resourceDirectory).value / "scala-native" / "generated" / "forwarders" / "glfw"
    IO.write(glfwDir / "const.c", include ++ constForwarders)

    Seq(glfwDir / "const.c")
}

glfw / genScalaForwarders := {
    val headerFile = vcpkgConfigurator.value.includes("glfw3") / "GLFW" / "glfw3.h"
    val headerContents = IO.read(headerFile)

    val packageName = "package glfw"
    val imports = """
        |import _root_.scala.scalanative.unsafe.*
        |import _root_.scala.scalanative.unsigned.*
        |import _root_.scala.scalanative.libc.*
        |import _root_.scala.scalanative.*
        |
        |""".stripMargin


    val constRegex: Regex = raw"#define (GLFW(_[A-Z0-9]*)+)\s+\S+\n".r
    val constForwarders = constRegex.findAllMatchIn(headerContents)
        .map(regexMatch => {
            val const = regexMatch.group(1)
            s"""@name("CONST_$const") @extern val $const: UInt = extern"""
        })
        .mkString("\n")

    val glfwDir = (glfw / Compile / sourceDirectory).value / "scala" / "generated" / "forwarders" / "glfw"
    IO.write(glfwDir / "constants.scala", packageName ++ imports ++ constForwarders)

    Seq(glfwDir / "constants.scala")
}


lazy val `opengl-bindings` = project
    .in(file("."))
    .aggregate(glad, glfw)
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
            scalaDir = (Compile / sourceDirectory).value / "scala" / "generated" / "libraries",
            cDir = (Compile / resourceDirectory).value / "scala-native" / "generated" / "libraries"
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