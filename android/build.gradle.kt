plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

group = "co.paystack.flutterpaystack"
version = "1.0-SNAPSHOT"

android {
    compileSdk = 32

    sourceSets["main"].java.srcDirs("src/main/kotlin")

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    defaultConfig {
        minSdk = 16
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        versionCode = 21
        versionName = "3.0.10"
    }

    lint {
        disable += "InvalidPackage"
    }
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation("com.google.android.material:material:1.7.0")
}
