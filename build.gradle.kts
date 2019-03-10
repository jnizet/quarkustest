plugins {
    val kotlinVersion = "1.3.21"

    java
    kotlin("jvm") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.allopen") version kotlinVersion
    id("io.quarkus.gradle.plugin") version "0.11.0"
}

repositories {
    mavenCentral()
    maven(url = uri("http://repository.jboss.org/nexus/content/groups/public"))
}

dependencies {
    implementation(platform("io.quarkus:quarkus-bom:0.11.0"))

    compileOnly("io.quarkus:quarkus-resteasy")
    implementation("io.quarkus:quarkus-arc")
    implementation("io.quarkus:quarkus-resteasy-jsonb")
    implementation("io.quarkus:quarkus-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

allOpen {
    annotations(
        "javax.ws.rs.Path"
    )
}

quarkus {
    setSourceDir("src/main/kotlin")
}
