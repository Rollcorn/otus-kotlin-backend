package ru.otus.otuskotlin.financyapp.blackbox.test.action

import mu.KotlinLogging
import ru.otus.otuskotlin.financyapp.blackbox.fixture.client.Client

private val log = KotlinLogging.logger {}

suspend fun Client.sendAndReceive(path: String, requestBody: String): String {
    log.info { "Send to v1/$path\n$requestBody" }

    val responseBody = sendAndReceive("v1", path, requestBody)
    log.info { "Received\n$responseBody" }

    return responseBody
}