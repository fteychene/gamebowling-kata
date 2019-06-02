lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "kata",
      scalaVersion := "2.12.7"
    )),
    name := "gamebownling"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test
