plugins {
    id("java-library")
    alias(libs.plugins.jetbrainsKotlinJvm)
    `maven-publish`
}

group = "com.github.Moriafly"
version = "0.1.0-dev02"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    testImplementation("junit:junit:4.13.2")
}