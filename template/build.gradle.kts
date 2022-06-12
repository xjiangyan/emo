plugins {
    id("emo.android.library")
    id("emo.android.library.compose")
}

version = "0.0.1"

android {
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}
dependencies {
    implementation(libs.androidx.core.ktx)
}
