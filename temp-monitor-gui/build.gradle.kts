plugins {
    java
    id("org.graalvm.buildtools.native") version "0.9.20" // TODO - for the whole project
    id("com.diffplug.spotless") version "6.19.0" // TODO - for the whole project
}

group = "com.temp.monitor"
version = "1.0-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_21

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

dependencies {
    implementation("org.apache.logging.log4j:log4j-api:2.20.0")
    implementation("org.apache.logging.log4j:log4j-core:2.20.0")

    implementation(project(":temp-monitor-core"))

    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
}
