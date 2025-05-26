plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

group = "co.paystack.flutterpaystack"
version = "1.0-SNAPSHOT"

buildscript {
    val kotlin_version by extra("1.7.20")

    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.4.0-rc02")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

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

dependencies {
    implementation("com.google.android.material:material:1.7.0")
}