plugins {
    kotlin("jvm")
}

group = rootProject.group
version = rootProject.version

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":api-v1-jackson"))
    implementation(project(":financyapp-common"))

    testImplementation(kotlin("test-junit"))
}
