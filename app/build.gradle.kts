import org.jetbrains.kotlin.config.JvmAnalysisFlags.useIR

val pagingVersion = "3.1.0"
val composeVersion = "1.3.0-alpha01"
val ktorVersion = "2.0.1"
val accompanistVersion = "0.24.8-beta"
val koinVersion= "3.2.0"
val koinKspVersion= "1.0.1"
val composeDestinationsVersion = "1.6.13-beta"
val kspPluginVersion = "1.7.10-1.0.6"
plugins {
    id("com.android.application")
    id("kotlin-android")
    kotlin("plugin.serialization")
    id("com.google.devtools.ksp") version "1.7.10-1.0.6"
    kotlin("kapt")
}

android {
    namespace = "com.mewsic.app"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.mewsic.app"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "0.0.1"

        vectorDrawables.useSupportLibrary = true
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
        freeCompilerArgs = freeCompilerArgs + "-opt-in=kotlin.RequiresOptIn" + "-P" + "plugin:androidx.compose.compiler.plugins.kotlin:suppressKotlinVersionCompatibilityCheck=true"
    }

    buildFeatures.compose = true

    composeOptions.kotlinCompilerExtensionVersion = "1.2.0"
}

kotlin {
    sourceSets {
        debug {
            kotlin.srcDir("build/generated/ksp/debug/kotlin")
        }
        release {
            kotlin.srcDir("build/generated/ksp/release/kotlin")
        }
    }
}
repositories {
    google()
    mavenCentral()
    maven {
        url = uri("https://maven.martmists.com/releases")
    }
}
dependencies {
    // core dependencies
    implementation("androidx.appcompat:appcompat:1.4.1")
    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.core:core-splashscreen:1.0.0-beta02")

    // compose dependencies
    implementation("androidx.compose.ui:ui:${composeVersion}")
    implementation("androidx.compose.ui:ui-tooling:${composeVersion}")
    implementation("androidx.compose.material3:material3:1.0.0-alpha12")
    implementation("androidx.compose.material:material-icons-extended:${composeVersion}")
    implementation("androidx.paging:paging-compose:1.0.0-alpha14")
    implementation("androidx.constraintlayout:constraintlayout-compose:1.1.0-alpha01") // ConstraintLayout

    // accompanist
    implementation("com.google.accompanist:accompanist-systemuicontroller:$accompanistVersion")
    implementation("com.google.accompanist:accompanist-placeholder-material:$accompanistVersion")
    implementation("com.google.accompanist:accompanist-swiperefresh:$accompanistVersion")
    implementation("com.google.accompanist:accompanist-drawablepainter:0.24.1-alpha")

    // compose destinations
    implementation("io.github.raamcosta.compose-destinations:animations-core:$composeDestinationsVersion")
    ksp("io.github.raamcosta.compose-destinations:ksp:$composeDestinationsVersion")

    // glide
    implementation("com.github.danchoo21:glide-image:1.2.2")
    implementation("com.github.bumptech.glide:glide:4.13.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.13.0")

    // other dependencies
    implementation("com.google.android.exoplayer:exoplayer:2.17.1")
    implementation("com.google.android.exoplayer:exoplayer-ui:2.17.1")

    // ktor
    implementation("io.ktor:ktor-client-core:$ktorVersion")
    implementation("io.ktor:ktor-client-android:$ktorVersion")
    implementation("io.ktor:ktor-client-content-negotiation:$ktorVersion")
    implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")

    // koin
    implementation("io.insert-koin:koin-core:$koinVersion")
    implementation("io.insert-koin:koin-android:$koinVersion")
    implementation("io.insert-koin:koin-android-compat:$koinVersion")
    implementation("io.insert-koin:koin-androidx-workmanager:$koinVersion")
    implementation("io.insert-koin:koin-androidx-navigation:$koinVersion")
    implementation("io.insert-koin:koin-androidx-compose:$koinVersion")
    implementation("io.insert-koin:koin-annotations:$koinKspVersion")
    ksp("io.insert-koin:koin-ksp-compiler:$koinKspVersion")


    // compose reorderables
    implementation("org.burnoutcrew.composereorderable:reorderable:0.9.2")

    // TODO: implement this in commons library
    implementation("io.michaelrocks.bimap:bimap:1.1.0")

    // settings storage in preference
    implementation("com.github.alorma:compose-settings-storage-preferences:0.7.2")
    implementation("com.github.alorma:compose-settings-storage-base:0.7.2")

    //
    implementation("com.mewsic:common-android:1.0-SNAPSHOT")
}