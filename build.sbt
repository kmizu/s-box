import sbt._
import sbt.internal.inc.classpath._
import Keys._
import java.util.jar.{Attributes, Manifest}

lazy val root = Project(
  id = "s-box",
  base = file(".")
).settings(commonSettings:_*)

lazy val commonSettings = Seq(
  version := "0.1-SNAPSHOT",
  scalaVersion := "2.12.4",
  organization := "com.github.s-box",
  scalacOptions ++= Seq("-encoding", "utf8", "-unchecked", "-deprecation", "-feature", "-language:implicitConversions", "-language:existentials"),
  libraryDependencies ++= Seq(
    "junit" % "junit" % "4.7" % "test",
    "org.scalatest" %% "scalatest" % "3.0.4" % "test"
  )
)
