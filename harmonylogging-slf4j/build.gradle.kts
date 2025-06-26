plugins {
    kotlin("jvm")
}

dependencies {
    api(project(":harmonylogging-common"))
    implementation("org.slf4j:slf4j-api:2.1.0-alpha1")
}

publishing {
    publications {
        register("PerfectDreams", MavenPublication::class.java) {
            from(components["java"])
        }
    }
}