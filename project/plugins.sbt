val BindgenVersion =
  sys.env.getOrElse("SN_BINDGEN_VERSION", "0.3.1")

val VcpkgVersion =
  sys.env.getOrElse("SBT_VCPKG_VERSION", "0.0.21")

val ScalaNativeVersion =
  sys.env.getOrElse("SCALA_NATIVE_VERSION", "0.5.10")

resolvers += Resolver.sonatypeCentralSnapshots

addSbtPlugin("org.scala-native" % "sbt-scala-native" % ScalaNativeVersion)
addSbtPlugin("com.indoorvivants" % "bindgen-sbt-plugin" % BindgenVersion)
addSbtPlugin("com.indoorvivants.vcpkg" % "sbt-vcpkg-native" % VcpkgVersion)

addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.3.1")
