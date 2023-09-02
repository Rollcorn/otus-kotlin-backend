package org.ok.shkandiuk.financyapp

import kotlinx.datetime.Instant
import org.ok.shkandiuk.financyapp.stubs.FinancyStubs
import org.ok.shkandiuk.financyapp.models.FinancyComand
import org.ok.shkandiuk.financyapp.models.common.*
import org.ok.shkandiuk.financyapp.models.transaction.FinancyTransaction

data class FinancyContext(
    var command: FinancyComand = FinancyComand.NONE,
    var state: FinancyState = FinancyState.NONE,
    val errors: MutableList<FinancyError> = mutableListOf(),

    var workMode: FinancyWorkMode = FinancyWorkMode.PROD,
    var stubCase: FinancyStubs = FinancyStubs.NONE,

    var requestId: FinancyRequestId = FinancyRequestId.NONE,
    var timeStart: Instant = Instant.NONE,
    var transactionRequest: FinancyTransaction = FinancyTransaction(),
    var transactionFilterRequest: FinancyTransactionFilter = FinancyTransactionFilter(),
    var transactionResponse: FinancyTransaction = FinancyTransaction(),
    var transactionsResponse: MutableList<FinancyTransaction> = mutableListOf(),
)