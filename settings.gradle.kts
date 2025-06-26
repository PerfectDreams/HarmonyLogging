plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "HarmonyLogging"

include(":harmonylogging-common")
include(":harmonylogging-slf4j")