plugins {
    id("java")
}

group = "org.home.micronaut"
version = "4.10.6-SNAPSHOT"

repositories {
    mavenCentral()
}


dependencies {
    testImplementation("io.micronaut.test:micronaut-test-junit5")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

java {
    sourceCompatibility = JavaVersion.toVersion("25")
    targetCompatibility = JavaVersion.toVersion("25")
    modularity.inferModulePath = false
}

tasks.compileJava {
    options.isDebug = true
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed")
    }
}
