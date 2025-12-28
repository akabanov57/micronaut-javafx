plugins {
    id("org.javamodularity.moduleplugin")
    id("application")
    id("org.openjfx.javafxplugin")
    id("micronaut-javafx.java-conventions")
    id("io.micronaut.minimal.library")
}

group = (project.findProperty("projectGroup") as String?)!!
version = project.findProperty("micronautVersion") as String? + "-SNAPSHOT"

dependencies {
    implementation(project(":demo-services"))
    implementation(project(":micronaut-javafx-launcher"))
    runtimeOnly("io.micronaut:micronaut-aop:4.10.10")
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

