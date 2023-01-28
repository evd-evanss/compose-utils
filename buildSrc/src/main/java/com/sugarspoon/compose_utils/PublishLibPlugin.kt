package com.sugarspoon.compose_utils

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.*
import java.io.FileInputStream

class PublishLibPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.configureMavenPublication()
    }

}

@Suppress("UnstableApiUsage")
private fun Project.configureMavenPublication() {
    apply(plugin = "maven-publish")
    apply(plugin = "com.android.library")
    apply(plugin = "kotlin-android")
    apply(plugin = "kotlin-kapt")

    tasks.register("${name}CleanLib") {
        dependsOn("clean")
    }
    tasks.register("${name}BuildLib") {
        description = "Build lib $name"
        if (name == "core-components") {
            dependsOn(":app:connectedDebugAndroidTest")
        }
        dependsOn("assembleRelease")
    }
    tasks.register("${name}PublishLib") {
        dependsOn("publish")
    }
    tasks.register("${name}PublishLibLocal") {
        dependsOn("publishToMavenLocal")
    }

    configure<PublishingExtension> {
        val githubProperties = java.util.Properties()
        githubProperties.load(FileInputStream(rootProject.file("github.properties")))

        publications {
            create<MavenPublication>("Android-Repositories") {
                groupId = LibConfig.groupId
                artifactId = getArtifactId(projectDir.name)
                version = getLibVersion(projectDir.name)
                artifact(getCurrentArtifact())
            }
            println("patch = ${getCurrentArtifact()}")
        }

        repositories {
            maven {
                name = "GitHubPackages"
                url = uri("https://maven.pkg.github.com/evd-evanss/compose-utils")
                credentials {
                    username =  githubProperties.getProperty("gpr.usr")
                    password =  githubProperties.getProperty("gpr.key")
                }
            }
        }
    }
}

private fun getArtifactId(module: String): String {
    return when (module) {
        LibConfig.CustomText.moduleName -> LibConfig.CustomText.artifactId
        else -> ""
    }
}

private fun getLibVersion(module: String): String {
    return when (module) {
        LibConfig.CustomText.moduleName -> LibConfig.CustomText.version
        else -> ""
    }
}

fun Project.getCurrentArtifact(): String {
    val name = projectDir.name
    return if (file("build/libs/${name}.jar").exists()) {
        "build/libs/${name}.jar"
    } else {
        "build/outputs/aar/${name}-release.aar"
    }
}