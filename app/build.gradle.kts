plugins {
    id("com.android.application")
}

android {
    namespace = "com.greenhealth.app"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.greenhealth.app"
        minSdk = 24
        targetSdk = 35
        versionCode = 3
        versionName = "1.2"
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
        }
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        buildConfig = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    // Start.io (formerly StartApp) ad SDK — banner + exit ads
    implementation("com.startapp:inapp-sdk:5.4.0")
}
