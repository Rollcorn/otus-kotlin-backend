rootProject.name = "otus-kotlin-backend"
include("m1l1-init")

pluginManagement {
    val kotlinVersion: String by settings
    plugins {
        kotlin("jvm") version kotlinVersion apply false
        application
    }
}