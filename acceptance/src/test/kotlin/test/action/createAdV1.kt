package ru.otus.otuskotlin.financyapp.blackbox.test.action

import io.kotest.assertions.withClue
import io.kotest.matchers.should
import ru.otus.otuskotlin.financyapp.blackbox.fixture.client.Client

suspend fun Client.createAd(): Unit =
    withClue("createAdV1") {
        val response = sendAndReceive(
            "transaction/create", """
                {
                    "name": "Bolt"
                }
            """.trimIndent()
        )

        response should haveNoErrors
    }
