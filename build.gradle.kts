plugins {
    id("java")
}


group = "org.example"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()
}


dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}


tasks.test {
    useJUnitPlatform()
}


tasks.register<JavaExec>("TestIfElse") {
    group = "application"
    description = "Run Test If Else"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("org.example.TestIfElse")
}


tasks.register<JavaExec>("TestSwitchCase") {
    group = "application"
    description = "Run Test Switch Case"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("org.example.TestSwitchCase")
}


tasks.register<JavaExec>("TestLooping") {
    group = "application"
    description = "Run Test Looping"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("org.example.TestLooping")
}

