pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    plugins {
        id("com.android.application") version "8.2.2" apply false
        id("org.jetbrains.kotlin.android") version "1.8.21" apply false
    }
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libsi") {
            from(files("gradle/libs.versions.toml"))
        }
    }
}

rootProject.name = "Xpense"
include(":app")
