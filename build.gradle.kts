plugins {
    kotlin("multiplatform") version "1.7.10" apply false
    id("com.android.library") version "7.0.3" apply false
    kotlin("plugin.serialization") version "1.7.10" apply false
    id("com.github.ben-manes.versions") version "0.42.0" apply false
    id("se.patrikerdes.use-latest-versions") version "0.2.18" apply false
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://maven.martmists.com/releases")
        }
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.2.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle.kts files
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }

}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}