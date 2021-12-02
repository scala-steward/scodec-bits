addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.7.1")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.1.0")
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.4.3")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.10.0")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.4")
addSbtPlugin("com.codecommit" % "sbt-github-actions" % "0.14.2")
addSbtPlugin("com.codecommit" % "sbt-spiewak-sonatype" % "0.22.1")
addSbtPlugin(
  "com.typesafe" % "sbt-mima-plugin" % "1.0.1"
) // Can remove when sbt-spiewak pulls in 1.0.1+
