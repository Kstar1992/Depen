name := "Depen"

version := "1.0"

scalaVersion := "2.10.4"

val sparkVersion  = "1.5.2"

libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion
libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion
