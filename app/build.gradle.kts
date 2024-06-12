plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.xpense"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.xpense"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libsi.androidx.core.ktx)
    implementation(libsi.androidx.appcompat)
    implementation(libsi.androidx.constraintlayout)
    implementation(libsi.androidx.recyclerview)
    implementation("androidx.cardview:cardview:1.0.0")

    // Room dependencies
    implementation(libsi.androidx.room.runtime)
    kapt(libsi.androidx.room.compiler)
    implementation(libsi.androidx.room.ktx)

    testImplementation(libsi.androidx.junit)
    androidTestImplementation(libsi.androidx.junit)
    androidTestImplementation(libsi.espresso.core)

        implementation("androidx.compose.ui:ui:1.6.7")
        implementation("androidx.compose.material3:material3:1.2.1")
        implementation("androidx.compose.ui:ui-tooling:1.6.7")
        implementation("androidx.compose.runtime:runtime-livedata:1.6.7")
        implementation("androidx.compose.runtime:runtime:1.6.7")
}
