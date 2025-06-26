plugins {
    kotlin("multiplatform") version "2.2.0"
}

allprojects {
    repositories {
        mavenCentral()
    }
}

kotlin {
    jvm()

    js {
        nodejs()
        browser()
    }
}