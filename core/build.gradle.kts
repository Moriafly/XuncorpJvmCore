plugins {
    id("java-library")
    alias(libs.plugins.jetbrainsKotlinJvm)
    `maven-publish`
}

group = "com.github.Moriafly"
version = "0.1.0-dev06"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    testImplementation("junit:junit:4.13.2")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}