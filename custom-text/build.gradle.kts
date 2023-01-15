plugins {
    id("com.android.library")
    id("kotlin-android")
    id("ComposeLibraryPlugin")
}

dependencies {
    implementation(AndroidX.compose.ui.tooling)
    implementation(AndroidX.compose.foundation)
}