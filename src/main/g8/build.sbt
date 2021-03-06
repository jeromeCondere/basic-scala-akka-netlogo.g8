
name := "$name$"

version := "$version$"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.8.3" % "test",
  "com.typesafe.akka" %% "akka-actor" % "2.4.16",
  "com.typesafe.akka" %% "akka-slf4j"   % "2.4.16",
  "com.typesafe.akka" %% "akka-remote"  % "2.4.16",
  "com.typesafe.akka" %% "akka-agent"   % "2.4.16",
  "com.typesafe.akka" %% "akka-testkit" % "2.4.16" % "test"
)

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"


//netlogo version 6.0.0 M4


//netlogo dependencies
libraryDependencies += "org.ow2.asm" % "asm" % "5.0.3"
libraryDependencies += "org.ow2.asm" % "asm-all" % "5.0.4"
libraryDependencies += "org.ow2.asm" % "asm-analysis" % "5.0.3"
libraryDependencies += "org.ow2.asm" % "asm-tree" % "5.0.3"
libraryDependencies += "org.ow2.asm" % "asm-util" % "5.0.3"



