plugins {
    id("org.javamodularity.moduleplugin")
    id("application")
    id("org.openjfx.javafxplugin")
    id("micronaut-javafx.java-conventions")
    id("io.micronaut.minimal.library")
    //id("io.micronaut.application")
}

group = "org.home.micronaut"
version = "4.9.2-SNAPSHOT"

dependencies {
    implementation(project(":demo-services"))
    implementation(project(":micronaut-javafx-launcher"))
    runtimeOnly("ch.qos.logback:logback-classic")
}

javafx {
    version = project.findProperty("javafxVersion") as String?
    modules("javafx.controls", "javafx.fxml")
}

application {
    mainModule = "micronaut.javafx.demo"
    mainClass = "com.example.demo.DemoLauncher"
}

