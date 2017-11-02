organization := "com.bk"
scalaVersion := "2.11.11"
name := "entity-extraction"


libraryDependencies ++= Seq(
  "edu.stanford.nlp" % "stanford-corenlp" % "3.8.0",
  "edu.stanford.nlp" % "stanford-corenlp" % "3.8.0" classifier "models",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)


publishMavenStyle := false

publishTo := {
  Some(s3resolver.value("Snapshots bucket", s3("com.ee.bdec.coderepo")) withIvyPatterns)
}