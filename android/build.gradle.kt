plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

group = "co.paystack.flutterpaystack"
version = "1.0-SNAPSHOT"

android {
    namespace = "co.paystack.flutterpaystack"
    compileSdk = 34

    sourceSets {
        getByName("main") {
            java.srcDirs("src/main/kotlin")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    defaultConfig {
        minSdk = 16
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.22")
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("com.google.android.material:material:1.9.0")

    // Flutter dependencies
    compileOnly("io.flutter:flutter_embedding_debug:1.0.0-0fdb562ac8069a8b4e83b69a2c3b7e5daaa9aa2b")

    // Paystack Android SDK
    implementation("co.paystack.android:paystack:3.1.5")
}