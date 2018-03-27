import sbt._
import sbt.internal.inc.classpath._
import Keys._
import java.util.jar.{Attributes, Manifest}

enablePlugins(TutPlugin)

scalaVersion in ThisBuild := "2.12.4"

organization in ThisBuild := "com.github.s-box"

version in ThisBuild := "0.1-SNAPSHOT"

lazy val root = project
  .in(file("."))
  .settings(name := "sbox_root")
  .aggregate(macroPeg)

lazy val macroPeg = project
  .in(file("macro_peg"))
  .settings(name := "macro_peg")
  .settings(commonSettings:_*)
  .settings(libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.0")

lazy val commonSettings = Seq(
  scalacOptions ++= Seq("-encoding", "utf8", "-unchecked", "-deprecation", "-feature", "-language:implicitConversions", "-language:existentials"),
  libraryDependencies ++= Seq(
    "junit" % "junit" % "4.7" % "test",
    "org.scalatest" %% "scalatest" % "3.0.4" % "test",
    "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"
  )
)
