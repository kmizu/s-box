import sbt._
import sbt.internal.inc.classpath._
import Keys._
import java.util.jar.{Attributes, Manifest}

enablePlugins(TutPlugin)

tutSourceDirectory := file("src") /" tut"

tutTargetDirectory := file(".")
