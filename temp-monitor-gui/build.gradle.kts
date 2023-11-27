// TODO - common plugins for the whole project
plugins {
    java
    id("io.freefair.lombok") version "8.4"
    id("org.graalvm.buildtools.native") version "0.9.20"
    id("com.diffplug.spotless") version "6.19.0"
}

group = "com.temp.monitor"
version = "1.0-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_21

dependencies {
    implementation(project(":temp-monitor-core"))
}
