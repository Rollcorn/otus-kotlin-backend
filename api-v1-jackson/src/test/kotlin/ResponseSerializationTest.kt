package org.shkandiuk.ok

import org.ok.shkandiuk.financyapp.api.v1.models.*
import org.shkandiuk.ok.api.v1.apiV1Mapper
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals

class ResponseSerializationTest {
    private val response = TransactionCreateResponse(
        requestId = "123",
        transaction = TransactionResponseObject(
            title = "transaction title",
            amount = "12 300",
            transactionType = TransactionType.INCOME,
            transactionStatus = TransactionStatus.TEMPORAL,
        )
    )

    @Test
    fun serialize() {
        val json = apiV1Mapper.writeValueAsString(response)

        assertContains(json, Regex("\"title\":\\s*\"transaction title\""))
        assertContains(json, Regex("\"responseType\":\\s*\"create\""))
    }

    @Test
    fun deserialize() {
        val json = apiV1Mapper.writeValueAsString(response)
        val obj = apiV1Mapper.readValue(json, IResponse::class.java) as TransactionCreateResponse

        assertEquals(response, obj)
    }
}