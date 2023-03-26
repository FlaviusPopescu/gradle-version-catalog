plugins {
    kotlin("jvm") version "1.8.0"
    id("version-catalog")
    application
}

group = "dev.flavius"
version = "1.0-SNAPSHOT"

catalog {
    versionCatalog {
        version("kotlin", "1.8.0")
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
}

application {
    mainClass.set("MainKt")
}