lazy val scalakata = (project in file(".")).
  enablePlugins(ScalaKataPlugin).
  settings(
    scalaVersion := "2.11.7",
    securityManager in Backend := true,
    resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases",
    libraryDependencies ++= Seq(
      "org.scodec" %% "scodec-stream" % "0.10.0"
    )
  )