plugins {
    id("org.openjfx.javafxplugin")
    id("micronaut-javafx.java-conventions")
    id("io.micronaut.minimal.library")
    id("org.javamodularity.moduleplugin")
    id("maven-publish")
}

java {
    withJavadocJar()
    withSourcesJar()
}

javafx {
    version = project.findProperty("javafxVersion") as String?
    modules("javafx.controls", "javafx.fxml")
}

group = (project.findProperty("projectGroup") as String?)!!
version = project.findProperty("micronautVersion") as String? + "-SNAPSHOT"

publishing {
    publications {
        create<MavenPublication>("maven") {
            artifactId = project.moduleName
            from(components["java"])
        }
        // Add your repositories here.
    }
}
