val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project
val exposed_version: String by project
val postgre_sql_version: String by project

group = "com.sosinvitalii"
version = "1.0"

plugins {
    kotlin("jvm") version "1.8.21"
    id("io.ktor.plugin") version "2.3.0"
    id("com.github.johnrengelman.shadow") version "7.1.2"
    kotlin("plugin.serialization") version "1.8.10"
    id("com.google.cloud.tools.appengine") version "2.4.2"
}

application {
//    mainClass.set("com.sosinvitalii.ApplicationKt")
    mainClass.set("io.ktor.server.netty.EngineMain")

//    val isDevelopment: Boolean = project.ext.has("development")
//    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

configure<com.google.cloud.tools.gradle.appengine.appyaml.AppEngineAppYamlExtension> {
    stage {
        setArtifact("build/libs/com.sosinvitalii.random-pro_backend-all.jar")
    }
    deploy {
        version = "1-0"
        projectId = "sonorous-seat-386117" // Заменить на секрет из ГитХаб
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-content-negotiation-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-cio-jvm:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    implementation("io.ktor:ktor-serialization-kotlinx-json:$ktor_version")

    implementation("org.jetbrains.exposed:exposed-core:$exposed_version")
    implementation("org.jetbrains.exposed:exposed-dao:$exposed_version")
    implementation("org.jetbrains.exposed:exposed-jdbc:$exposed_version")
    implementation("org.postgresql:postgresql:$postgre_sql_version")
    implementation("io.ktor:ktor-server-netty:$ktor_version")

    testImplementation("io.ktor:ktor-server-tests-jvm:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
}