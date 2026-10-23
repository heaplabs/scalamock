// heaplabs fork only (heaplabs/smartreach_backend#14572): upstream 7.6.0 plus "Name mock functions by
// signature, not by position". Publish the two JVM artifacts SmartReach uses with
//   GOOGLE_OAUTH_ACCESS_TOKEN=$(gcloud auth print-access-token) sbt scalamockJVM/publish scalamock-scalatestJVM/publish
// Bump the version for every publish; never republish one in place.
ThisBuild / version := "7.6.0-sr.1"
ThisBuild / publishTo := Some("sr-forks" at "artifactregistry://us-central1-maven.pkg.dev/smrtcloud/sr-forks")
