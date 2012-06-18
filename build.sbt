organization := "com.wordnik"

name := "swagger-scalatra-sample-app"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.9.1"

scalaSource in Compile <<= baseDirectory.identity

seq(webSettings :_*)

libraryDependencies ++= Seq(
  "com.fasterxml.jackson.module" % "jackson-module-scala" % "2.0.0" % "compile;container;test;runtime",
  "org.scalatra" % "scalatra" % "2.1.0-SNAPSHOT",
  "org.scalatra" % "scalatra-scalate" % "2.1.0-SNAPSHOT",
  "org.scalatra" % "scalatra-specs2" % "2.1.0-SNAPSHOT" % "test",
  "org.scalatra" % "scalatra-swagger" % "2.1.0-SNAPSHOT",
  "ch.qos.logback" % "logback-classic" % "1.0.0" % "runtime",
  "org.eclipse.jetty" % "jetty-server" % "8.1.3.v20120416" % "compile;container;test;runtime",
  "org.eclipse.jetty" % "jetty-servlet" % "8.1.3.v20120416" % "compile;container;test;runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.3.v20120416" % "compile;container;test;runtime",
  "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided;container;test;runtime"
)

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

ivyXML := <dependencies>
			<exclude org="org.eclipse.jetty.orbit" />
		  </dependencies>