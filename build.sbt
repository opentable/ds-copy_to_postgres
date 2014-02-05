name := "CopyToPostgres"

version := "0.2.0"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
  "com.bizo" % "mighty-csv_2.10" % "0.2",
  "org.apache.avro" % "avro" % "1.7.5",
  "org.postgresql" % "postgresql" % "9.3-1100-jdbc41"
)

