plugins {
    kotlin("jvm")
}

group = rootProject.group
version = rootProject.version

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":finance-api-v1-jackson"))
    implementation(project(":finance-app-common"))

    testImplementation(kotlin("test-junit"))
}
