pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        mavenLocal()
        maven { url = uri("https://jitpack.io") }
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
include(":grids")
