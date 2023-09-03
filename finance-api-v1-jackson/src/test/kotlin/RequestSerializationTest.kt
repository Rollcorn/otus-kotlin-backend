package org.shkandiuk.ok;

import org.ok.shkandiuk.financyapp.api.v1.models.*
import org.shkandiuk.ok.api.v1.apiV1Mapper
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals

class RequestSerializationTest {
    private val request = TransactionCreateRequest(
        requestId = "123",
        debug = TransactionDebug(
            mode = TransactionRequestDebugMode.STUB,
            stub = TransactionRequestDebugStubs.BAD_TITLE
        ),
        transaction = TransactionCreateObject(
            title = "ad title",
            amount = "12 300",
            transactionType =  TransactionType.INCOME,
            transactionStatus = TransactionStatus.TEMPORAL,
        )
    )

    @Test
    fun serialize() {
        val json = apiV1Mapper.writeValueAsString(request)

        assertContains(json, Regex("\"title\":\\s*\"ad title\""))
        assertContains(json, Regex("\"mode\":\\s*\"stub\""))
        assertContains(json, Regex("\"stub\":\\s*\"badTitle\""))
        assertContains(json, Regex("\"requestType\":\\s*\"create\""))
    }

    @Test
    fun deserialize() {
        val json = apiV1Mapper.writeValueAsString(request)
        val obj = apiV1Mapper.readValue(json, IRequest::class.java) as TransactionCreateRequest

        assertEquals(request, obj)
    }

    @Test
    fun deserializeNaked() {
        val jsonString = """
            {"requestId": "123"}
        """.trimIndent()
        val obj = apiV1Mapper.readValue(jsonString, TransactionCreateRequest::class.java)

        assertEquals("123", obj.requestId)
    }
}
