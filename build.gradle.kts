// Top-level build file where you can add configuration options common to all sub-projects/modules.
//plugins {
    //alias(libs.plugins.android.application) apply false
   // alias(libs.plugins.jetbrains.kotlin.android) apply false
//}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "2.0.0" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.0"
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
