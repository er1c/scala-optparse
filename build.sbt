FMPublic

name := "scala-optparse"

description := "Command line option parsing for Scala"

scalaVersion := "2.12.1"

// Note: Use "++ 2.11.1" to select a specific version when building
crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.1")

scalacOptions := Seq("-unchecked", "-deprecation", "-language:implicitConversions", "-feature", "-Xlint")

// Use .target instead of target so it doesn't interfere with native sbt
EclipseKeys.eclipseOutput := Some(".target")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"
