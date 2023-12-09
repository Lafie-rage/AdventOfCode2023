plugins {
    kotlin("jvm") version "1.9.21"
}

group = "fr.lafie.rage"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("com.willowtreeapps.assertk:assertk:0.28.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(20)
}