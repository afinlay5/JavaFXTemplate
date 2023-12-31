plugins {
    java
    id("io.freefair.lombok") version "8.4"
    id("org.graalvm.buildtools.native") version "0.9.20"
    id("com.diffplug.spotless") version "6.19.0"
}

group = "com.temp.monitor"
version = "1.0-SNAPSHOT"
//java.sourceCompatibility = JavaVersion.VERSION_21
//java.targetCompatibility = JavaVersion.VERSION_21

dependencies {
    implementation("com.google.guava:guava:32.0.0-jre")
    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation("org.apache.commons:commons-collections4:4.4")
    implementation("org.apache.logging.log4j:log4j-api:2.20.0")
    implementation("org.apache.logging.log4j:log4j-core:2.20.0")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
