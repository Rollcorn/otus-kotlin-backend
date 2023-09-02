rootProject.name = "otus-kotlin-backend"

pluginManagement {
    val kotlinVersion: String by settings
    val openapiVersion: String by settings

    plugins {
        kotlin("jvm") version kotlinVersion apply false

        kotlin("plugin.serialization") version kotlinVersion apply false

        id("org.openapi.generator") version openapiVersion apply false
//        application
    }
}

include("api-v1-jackson")
include("acceptance")
//include("m1l1-init")
include("financyapp-common")
//include("financyapp-mappers-v1")
