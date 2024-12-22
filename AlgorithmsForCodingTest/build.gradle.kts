plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    implementation("org.seleniumhq.selenium:selenium-java:4.14.0")

    // ChromeDriver for running tests on Chrome
    implementation("org.seleniumhq.selenium:selenium-chrome-driver:4.14.0")

    // (Optional) WebDriver Manager - Automatically manages WebDriver binaries
    implementation("io.github.bonigarcia:webdrivermanager:5.5.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}