import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    kotlin("jvm") version "1.5.31"
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}

gradlePlugin {
    plugins.register("ComposeLibraryPlugin") {
        id = "ComposeLibraryPlugin"
        implementationClass = "com.sugarspoon.compose_utils.ComposeLibraryPlugin"
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions.apiVersion = "1.7.10"
}

dependencies {
    implementation(gradleApi())
    implementation("com.android.tools.build:gradle:7.2.1")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
    implementation("org.jetbrains.dokka:dokka-gradle-plugin:1.7.20")
    implementation("app.cash.licensee:licensee-gradle-plugin:1.4.1")
}