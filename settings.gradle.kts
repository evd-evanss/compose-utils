pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

plugins {
    id("de.fayard.refreshVersions") version "0.51.0"
}

refreshVersions {
    enableBuildSrcLibs()
}

rootProject.name = "Compose Utils"
include(":app")
include(":custom-text")
