plugins {
    java
    application
    id ("org.javamodularity.moduleplugin") version "1.8.12"
    id ("org.beryx.jlink") version "3.0.1"

    id("org.openjfx.javafxplugin") version "0.1.0"

    id("io.freefair.lombok") version "8.4"
    id("com.diffplug.spotless") version "6.22.0"
}

group = "com.temp.monitor"
version = "1.0-SNAPSHOT"
//java.sourceCompatibility = JavaVersion.VERSION_21
//java.targetCompatibility = JavaVersion.VERSION_21

dependencies {
    implementation(project(":temp-monitor-core"))
}

javafx {
    modules("javafx.controls", "javafx.fxml")
}

application{
    mainModule = "com.temp.monitor.ui"
    mainClass = "com.temp.monitor.ui.TempMonitorLauncher"
}


jlink {
    imageZip = project.file("${buildDir}/distributions/app-${javafx.platform.classifier}.zip")
    options = listOf("--strip-debug", "--compress", "2", "--no-header-files", "--no-man-pages")
    launcher {
        name = "TempMonitor"
    }
    group = "distribution"
}

//jlinkZip {
//    group = "distribution"
//}