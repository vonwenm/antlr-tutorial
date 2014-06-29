import sbt._
import Keys._

sbtPlugin := true


name := "sbt-antlr4-demo"

organization := "com.simplytyped"

version := "0.7.2"

antlr4Settings

addSbtPlugin("org.softnetwork.sbt.plugins" % "sbt-groovy" % "0.1")

publishTo := Some {
  val target = if(version.value contains "SNAPSHOT") "snapshots" else "releases"
  Resolver.file("simplytyped.com", new File("/Users/ihji/Works/simplytyped.github.io/repo",target))
}

