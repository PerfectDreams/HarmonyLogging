plugins {
    kotlin("multiplatform") version "2.2.0" apply false
    `maven-publish`
}

allprojects {
    group = "net.perfectdreams.harmony.logging"
    version = "1.0.3"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply<MavenPublishPlugin>()

    publishing {
        repositories {
            maven {
                name = "PerfectDreams"
                url = uri("https://repo.perfectdreams.net/")
                credentials(PasswordCredentials::class)
            }
        }
    }
}