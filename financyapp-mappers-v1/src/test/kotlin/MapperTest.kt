package org.ok.shkandiuk.financyapp.mappers.v1

import org.junit.Test
import org.ok.shkandiuk.financyapp.FinancyContext
import org.ok.shkandiuk.financyapp.api.v1.models.*
import org.ok.shkandiuk.financyapp.models.FinanceCommand
import org.ok.shkandiuk.financyapp.models.common.*
import org.ok.shkandiuk.financyapp.models.transaction.FinanceTransaction
import org.ok.shkandiuk.financyapp.models.transaction.FinanceTransactionId
import org.ok.shkandiuk.financyapp.models.transaction.FinanceTransactionStatus
import org.ok.shkandiuk.financyapp.models.transaction.FinanceTransactionType
import org.ok.shkandiuk.financyapp.stubs.FinancyStubs
import java.util.*
import kotlin.test.assertEquals

class MapperTest {

    @Test
    fun fromTransport() {
        val req = TransactionCreateRequest(
            requestId = "1234",
            debug = TransactionDebug(
                mode = TransactionRequestDebugMode.STUB,
                stub = TransactionRequestDebugStubs.SUCCESS,
            ),
            transaction = TransactionCreateObject(
                title = "title",
                amount = "11000",
                transactionType = TransactionType.INCOME,
                transactionStatus = TransactionStatus.TEMPORAL,
            ),
        )

        val context = FinancyContext()
        context.fromTransport(req)

        assertEquals(FinancyStubs.SUCCESS, context.stubCase)
        assertEquals(FinanceWorkMode.STUB, context.workMode)
        assertEquals("title", context.transactionRequest.title)
        assertEquals(FinanceTransactionType.INCOME, context.transactionRequest.type)
        assertEquals(FinanceTransactionStatus.TEMPORAL, context.transactionRequest.status)
    }

    @Test
    fun toTransport() {
        val givenId = UUID.randomUUID().toString()
        val context = FinancyContext(
            requestId = FinanceRequestId("1234"),
            command = FinanceCommand.CREATE,
            transactionResponse = FinanceTransaction(
                title = "title",
                amount = "12000",
                type = FinanceTransactionType.INCOME,
                status = FinanceTransactionStatus.SINGLE,
                ownerId = FinanceUserId("123132"),
                id = FinanceTransactionId(givenId),
            ),
            errors = mutableListOf(
                FinanceError(
                    code = "err",
                    group = "request",
                    field = "title",
                    message = "wrong title",
                )
            ),
            state = FinanceState.RUNNING,
        )

        val req = context.toTransportTransaction() as TransactionCreateResponse

        assertEquals("1234", req.requestId)
        assertEquals("title", req.transaction?.title)
        assertEquals("12000", req.transaction?.amount)
        assertEquals(TransactionStatus.SINGLE, req.transaction?.transactionStatus)
        assertEquals(TransactionType.INCOME, req.transaction?.transactionType)
        assertEquals("123132", req.transaction?.ownerId)
        assertEquals(givenId, req.transaction?.id)
        assertEquals(1, req.errors?.size)
        assertEquals("err", req.errors?.firstOrNull()?.code)
        assertEquals("request", req.errors?.firstOrNull()?.group)
        assertEquals("title", req.errors?.firstOrNull()?.field)
        assertEquals("wrong title", req.errors?.firstOrNull()?.message)
    }
}

