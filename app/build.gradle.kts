import de.fayard.refreshVersions.core.versionFor

import com.sugarspoon.compose_utils.Versions

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
}

repositories {
    google()
    mavenCentral()
}

android {
    compileSdk = Versions.AndroidConfig.compileSdk

    defaultConfig {
        applicationId = "com.sugarspoon.composeutils"
        minSdk = Versions.AndroidConfig.minSdk
        targetSdk = Versions.AndroidConfig.compileSdk
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
        freeCompilerArgs = freeCompilerArgs + listOf(
            "-opt-in=kotlin.RequiresOptIn"
        )
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.0"//versionFor(AndroidX.compose.ui)
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(project(":custom-text"))
    implementation(project(":grids"))
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar", "*.aar"))))

    implementation(AndroidX.appCompat)
    implementation(Google.Android.material)

    implementation(AndroidX.activity.compose)
    implementation(AndroidX.navigation.compose)
    implementation(AndroidX.compose.ui.tooling)
    implementation(AndroidX.compose.material)

    implementation(Google.accompanist.systemUiController)
}
