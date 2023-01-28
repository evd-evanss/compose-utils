plugins {
    id("com.android.library")
    id("kotlin-android")
    id("ComposeLibraryPlugin")
    id("PublishLibPlugin")
}

dependencies {
    implementation(AndroidX.compose.ui.tooling)
    implementation(AndroidX.compose.foundation)
    implementation(AndroidX.compose.material)
}