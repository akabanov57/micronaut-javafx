plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation("org.javamodularity.moduleplugin:org.javamodularity.moduleplugin.gradle.plugin:2.0.0")
    implementation("io.micronaut.minimal.library:io.micronaut.minimal.library.gradle.plugin:4.6.1")
    implementation("io.micronaut.application:io.micronaut.application.gradle.plugin:4.6.1")
    implementation("org.openjfx.javafxplugin:org.openjfx.javafxplugin.gradle.plugin:0.1.0")
    //implementation("org.beryx.jlink:org.beryx.jlink.gradle.plugin:3.1.2")
}
