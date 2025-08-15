plugins {
    id("org.openjfx.javafxplugin")
    id("micronaut-javafx.java-conventions")
    id("io.micronaut.minimal.library")
    id("org.javamodularity.moduleplugin")
}

javafx {
    version = project.findProperty("javafxVersion") as String?
    modules("javafx.controls", "javafx.fxml")
}

group = "org.home.micronaut"
version = "4.9.2-SNAPSHOT"

