ThisBuild / description := "Scala-Native bindings for OpenGL using GLAD and GLFW3"
ThisBuild / homepage := Some(url("https://github.com/josh-ja-walker/opengl-bindings"))

ThisBuild / version := "0.1.3-SNAPSHOT"
ThisBuild / versionScheme := Some(VersionScheme.EarlySemVer)

ThisBuild / organization := "io.github.josh-ja-walker"
ThisBuild / organizationName := "Joshua Walker"
ThisBuild / organizationHomepage := Some(url("https://github.com/josh-ja-walker"))

ThisBuild / scmInfo := Some(
    ScmInfo(
        url("https://github.com/josh-ja-walker/opengl-bindings"),
        "scm:git@github.com:josh-ja-walker/opengl-bindings.git"
    )
)

ThisBuild / developers := List(
    Developer(
        id = "josh-ja-walker", 
        name = "Josh Walker", 
        email = "josh.ja.walker@outlook.com", 
        url = url("https://github.com/josh-ja-walker")
    )
)

ThisBuild / description := "Scala-Native bindings for OpenGL using GLAD and GLFW3"
ThisBuild / licenses := List("BSD-3-Clause" -> url("https://opensource.org/licenses/BSD-3-Clause"))

// Remove all additional repository other than Maven Central from POM
ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishMavenStyle := true

ThisBuild / publishTo := {
    val centralSnapshots = "https://central.sonatype.com/repository/maven-snapshots/"
    if (isSnapshot.value) Some("central-snapshots" at centralSnapshots)
    else localStaging.value
}

ThisBuild / publishTo := localStaging.value