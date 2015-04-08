name := """play-example-postgres"""

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  jdbc,
  javaEbean,
  "org.webjars" % "jquery" % "2.1.1",
  "org.webjars" % "bootstrap" % "3.3.1",
  "org.postgresql" % "postgresql" % "9.3-1102-jdbc4"
)     

lazy val root = (project in file(".")).enablePlugins(PlayJava)
