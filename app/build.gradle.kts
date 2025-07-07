plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
<<<<<<< HEAD
    namespace = "com.alpha.mosaic"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.alpha.mosaic"
=======
    namespace = "com.mosaicapplication.mosaicapp"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.mosaicapplication.mosaicapp"
>>>>>>> 880b41676385f96f4d673b6e8ce1c84d1b731c94
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
<<<<<<< HEAD
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.14" // Compatible with Compose 1.6.x
    }
}

dependencies {
=======
}

dependencies {

>>>>>>> 880b41676385f96f4d673b6e8ce1c84d1b731c94
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
<<<<<<< HEAD
    implementation("androidx.navigation:navigation-compose:2.7.7") // Use stable version
=======
>>>>>>> 880b41676385f96f4d673b6e8ce1c84d1b731c94
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
<<<<<<< HEAD
=======
    implementation("androidx.navigation:navigation-compose:2.7.5")
>>>>>>> 880b41676385f96f4d673b6e8ce1c84d1b731c94
}