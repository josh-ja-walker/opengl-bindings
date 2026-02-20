import scala.util.matching.Regex

import bindgen.interface.Binding
import bindgen.plugin.BindgenMode
 
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


lazy val library = settingKey[String]("Name of the library")

lazy val snGenDir = settingKey[File]("Directory of generated Scala-Native files")
lazy val scalaGenDir = settingKey[File]("Directory of generated Scala files")


lazy val deleteGenerated = taskKey[Unit]("Delete generated bindings and forwarders")
lazy val commonSettings = Seq(
    snGenDir := (Compile / resourceDirectory).value / "scala-native" / "generated",
    scalaGenDir := (Compile / sourceDirectory).value / "scala" / "generated",

    deleteGenerated := {
        IO.delete(snGenDir.value)
        IO.delete(scalaGenDir.value)
    }
)


lazy val genBindings = taskKey[Seq[File]]("Generate bindings")
lazy val deleteBindings = taskKey[Unit]("Delete generated bindings")

lazy val bindingTasks = Seq(
    genBindings := {
        val bindings = (Compile / bindgenGenerateScalaSources).value

        // Remove opaque modifier from aliases files 
        bindings.filter(_.name == "aliases.scala")
            .foreach(binding => {
                val content: String = IO.read(binding)
                IO.write(binding, content.replace("opaque ", new String()))
            })

        
        val libDir = (Compile / sourceDirectory).value / "scala" / "generated" / "libraries"   

        // Delete existing generated library bindings 
        IO.delete(libDir / library.value)

        // Rename opengl.bindings.lib directory to lib
        IO.move(libDir / ("opengl.bindings." + library.value), libDir / library.value)

        bindings
    },

    deleteBindings := {
        IO.delete(snGenDir.value / "libraries")
        IO.delete(scalaGenDir.value / "libraries")
    }
)


lazy val genForwarders = taskKey[Seq[File]]("Generate C and Scala forwarders for C preprocessor constants")
lazy val deleteForwarders = taskKey[Unit]("Delete generated forwarders")

lazy val genCForwarders = taskKey[Seq[File]]("Generate C forwarders for C preprocessor constants")
lazy val genScalaForwarders = taskKey[Seq[File]]("Generate Scala forwarders for C preprocessor constants")

lazy val forwarderTasks = Seq(
    genForwarders := genCForwarders.value ++ genScalaForwarders.value,

    deleteForwarders := {
        IO.delete(snGenDir.value / "forwarders")
        IO.delete(scalaGenDir.value / "forwarders")
    }
)



lazy val glad = project
    .in(file("glad"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin)
    .settings(
        library := "glad",

        bindgenBindings += {
            val include = (Compile / resourceDirectory).value / "scala-native" / "libraries" / "glad" / "include"
            Binding(include / "glad" / "gl.h", "opengl.bindings.glad")
                .withCImports(List("gl.h", "khrplatform.h"))
                .withClangFlags(List("-I" + include))
        },
        
        nativeConfig := {
            val gladBase = (Compile / resourceDirectory).value / "scala-native" / "libraries" / "glad"
            val compFlags = List(s"-I${gladBase / "include"}")
            val linkFlags = List(s"-L$gladBase")
            
            nativeConfig.value
                .withCompileOptions(_ ++ compFlags)
                .withLinkingOptions(_ ++ linkFlags)
        }
    )
    .settings(commonSettings)
    .settings(bindgenSettings)
    .settings(bindingTasks)
    .settings(forwarderTasks)


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


lazy val glfw = project
    .in(file("glfw"))
    .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
    .settings(
        library := "glfw",

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
    .settings(commonSettings)
    .settings(bindgenSettings)
    .settings(bindingTasks)
    .settings(forwarderTasks)


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
