import sbt._

object Dependencies {

  lazy val akkaVersion = "2.6.16"

  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.8"
  lazy val akkaActor =   "com.typesafe.akka" %% "akka-actor" % akkaVersion

}
