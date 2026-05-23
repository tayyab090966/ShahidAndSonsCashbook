plugins {
    id("com.android.application") version "8.2.0"
    id("org.jetbrains.kotlin.android") version "1.9.0"
}
android {
    namespace = "com.shahidandsons.generalstore.cashbook"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.shahidandsons.generalstore.cashbook"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
}
