package org.ok.shkandiuk.financyapp

import kotlinx.datetime.Instant
import org.ok.shkandiuk.financyapp.stubs.FinancyStubs
import org.ok.shkandiuk.financyapp.models.FinanceCommand
import org.ok.shkandiuk.financyapp.models.common.*
import org.ok.shkandiuk.financyapp.models.transaction.FinanceTransaction

data class FinanceContext(
    var command: FinanceCommand = FinanceCommand.NONE,
    var state: FinanceState = FinanceState.NONE,
    val errors: MutableList<FinanceError> = mutableListOf(),

    var workMode: FinanceWorkMode = FinanceWorkMode.PROD,
    var stubCase: FinancyStubs = FinancyStubs.NONE,

    var requestId: FinanceRequestId = FinanceRequestId.NONE,
    var timeStart: Instant = Instant.NONE,
    var transactionRequest: FinanceTransaction = FinanceTransaction(),
    var transactionFilterRequest: FinanceTransactionFilter = FinanceTransactionFilter(),
    var transactionResponse: FinanceTransaction = FinanceTransaction(),
    var transactionsResponse: MutableList<FinanceTransaction> = mutableListOf(),
)