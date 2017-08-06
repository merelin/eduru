name := "EduRu"

version := "1.0"

scalaVersion := "2.12.3"

libraryDependencies ++= Seq(
  "org.json4s" %% "json4s-ast" % "3.5.3",
  "org.json4s" %% "json4s-core" % "3.5.3",
  "org.json4s" %% "json4s-native" % "3.5.3",
  "org.json4s" %% "json4s-ext" % "3.5.3",
  "com.h2database" % "h2" % "1.4.193"
)
        