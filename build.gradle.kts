buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.4.1")
    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
