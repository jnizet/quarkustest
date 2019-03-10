rootProject.name = "quarkustest"

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "io.quarkus.gradle.plugin") {
                useModule("io.quarkus:quarkus-gradle-plugin:${requested.version}")
            }
        }
    }
}
