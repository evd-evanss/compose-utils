buildscript {
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
    }
}
repositories {
    mavenCentral()
}

tasks.create<Delete>("clean") {
    delete(rootProject.buildDir)
}
