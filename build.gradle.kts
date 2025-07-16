plugins {
    id("com.android.application") version "7.4.2" apply false
    kotlin("android") version "1.8.22" apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
