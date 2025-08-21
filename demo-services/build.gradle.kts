plugins {
    id("micronaut-javafx.java-conventions")
    id("io.micronaut.minimal.library")
    id("org.javamodularity.moduleplugin")
    id("java-library")
}

group = (project.findProperty("projectGroup") as String?)!!
version = project.findProperty("micronautVersion") as String? + "-SNAPSHOT"

