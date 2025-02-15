// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    // Android application plugin
    alias(libs.plugins.android.application) apply false
    // Kotlin Android plugin
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    // Chaquopy plugin for Python integration
    id("com.chaquo.python") version "15.0.1" apply false
}

// Optional: Configure tasks or settings that apply to all subprojects
tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
