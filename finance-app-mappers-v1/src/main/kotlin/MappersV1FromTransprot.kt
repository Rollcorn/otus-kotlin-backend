package org.ok.shkandiuk.financyapp.mappers.v1

import org.ok.shkandiuk.financyapp.FinanceContext
import org.ok.shkandiuk.financyapp.api.v1.models.*
import org.ok.shkandiuk.financyapp.exception.UnknownRequestClass
import org.ok.shkandiuk.financyapp.models.FinanceCommand
import org.ok.shkandiuk.financyapp.models.common.FinanceRequestId
import org.ok.shkandiuk.financyapp.models.common.FinanceWorkMode
import org.ok.shkandiuk.financyapp.models.transaction.FinanceTransaction
import org.ok.shkandiuk.financyapp.models.transaction.FinanceTransactionId
import org.ok.shkandiuk.financyapp.models.transaction.FinanceTransactionStatus
import org.ok.shkandiuk.financyapp.models.transaction.FinanceTransactionType
import org.ok.shkandiuk.financyapp.stubs.FinancyStubs

fun FinanceContext.fromTransport(request: IRequest) = when (request) {
    is TransactionCreateRequest -> fromTransport(request)
    is TransactionReadRequest -> fromTransport(request)
    is TransactionDeleteRequest -> fromTransport(request)
    is TransactionUpdateRequest -> fromTransport(request)
    else -> throw UnknownRequestClass(request.javaClass)
}

private fun String?.toTransactionId() = this?.let { FinanceTransactionId(it) } ?: FinanceTransactionId.NONE
private fun String?.toTransactionWithId() = FinanceTransaction(id = this.toTransactionId())
private fun IRequest?.requestId() = this?.requestId?.let { FinanceRequestId(it) } ?: FinanceRequestId.NONE

fun FinanceContext.fromTransport(request: TransactionCreateRequest) {
    command = FinanceCommand.CREATE
    requestId = request.requestId()
    transactionRequest = request.transaction?.toInternal() ?: FinanceTransaction()
    workMode = request.debug.transportToWorkMode()
    stubCase = request.debug.transportToStubCase()
}

fun FinanceContext.fromTransport(request: TransactionReadRequest) {
    command = FinanceCommand.READ
    requestId = request.requestId()
    transactionRequest = request.transaction?.id.toTransactionWithId()
    workMode = request.debug.transportToWorkMode()
    stubCase = request.debug.transportToStubCase()
}

fun FinanceContext.fromTransport(request: TransactionDeleteRequest) {
    command = FinanceCommand.CREATE
    requestId = request.requestId()
    transactionRequest = request.transaction?.id.toTransactionWithId()
    workMode = request.debug.transportToWorkMode()
    stubCase = request.debug.transportToStubCase()
}

fun FinanceContext.fromTransport(request: TransactionUpdateRequest) {
    command = FinanceCommand.CREATE
    requestId = request.requestId()
    transactionRequest = request.transaction?.toInternal() ?: FinanceTransaction()
    workMode = request.debug.transportToWorkMode()
    stubCase = request.debug.transportToStubCase()
}

private fun TransactionDebug?.transportToStubCase(): FinancyStubs = when (this?.stub){
    TransactionRequestDebugStubs.BAD_DESCRIPTION -> FinancyStubs.BAD_DESCRIPTION
    TransactionRequestDebugStubs.BAD_ID -> FinancyStubs.BAD_ID
    TransactionRequestDebugStubs.BAD_TITLE -> FinancyStubs.BAD_TITLE
    TransactionRequestDebugStubs.BAD_SEARCH_STRING -> FinancyStubs.BAD_SEARCH_STRING
    TransactionRequestDebugStubs.BAD_VISIBILITY -> FinancyStubs.BAD_VISIBILITY
    TransactionRequestDebugStubs.CANNOT_DELETE -> FinancyStubs.CANNOT_DELETE
    TransactionRequestDebugStubs.NOT_FOUND -> FinancyStubs.NOT_FOUND
    TransactionRequestDebugStubs.SUCCESS -> FinancyStubs.SUCCESS
    null -> FinancyStubs.NONE
}

private fun TransactionDebug?.transportToWorkMode(): FinanceWorkMode  = when (this?.mode) {
    TransactionRequestDebugMode.PROD -> FinanceWorkMode.PROD
    TransactionRequestDebugMode.STUB -> FinanceWorkMode.STUB
    TransactionRequestDebugMode.TEST -> FinanceWorkMode.TEST
    null -> FinanceWorkMode.PROD

}

private fun TransactionCreateObject.toInternal(): FinanceTransaction = FinanceTransaction(
    title = this.title ?: "",
    amount = this.amount ?: "0",
    type = this.transactionType.fromTransport(),
    status = this.transactionStatus.fromTransport(),
)

private fun TransactionUpdateObject.toInternal(): FinanceTransaction = FinanceTransaction(
    title = this.title ?: "",
    amount = this.amount ?: "0",
    type = this.transactionType.fromTransport(),
    status = this.transactionStatus.fromTransport(),
)

private fun TransactionStatus?.fromTransport(): FinanceTransactionStatus = when(this) {
    TransactionStatus.CONSTANT -> FinanceTransactionStatus.CONSTANT
    TransactionStatus.SINGLE -> FinanceTransactionStatus.SINGLE
    TransactionStatus.TEMPORAL -> FinanceTransactionStatus.TEMPORAL
    null -> FinanceTransactionStatus.SINGLE
}

private fun TransactionType?.fromTransport(): FinanceTransactionType = when (this) {
    TransactionType.INCOME -> FinanceTransactionType.INCOME
    TransactionType.OUTCOME -> FinanceTransactionType.OUTCOME
    null -> FinanceTransactionType.INCOME
}
