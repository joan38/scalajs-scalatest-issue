lazy val test = crossProject
  .crossType(CrossType.Pure)
  .enablePlugins(ScalaJSPlugin)
  .settings(
    libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.4" % "test"
  )
lazy val testJVM = test.jvm
lazy val testJS = test.js
