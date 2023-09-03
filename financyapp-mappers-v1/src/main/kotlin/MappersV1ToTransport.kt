package org.ok.shkandiuk.financyapp.mappers.v1

import org.ok.shkandiuk.financyapp.FinancyContext
import org.ok.shkandiuk.financyapp.api.v1.models.*
import org.ok.shkandiuk.financyapp.exception.UnknownFinanceCommand
import org.ok.shkandiuk.financyapp.models.FinanceCommand
import org.ok.shkandiuk.financyapp.models.common.FinanceError
import org.ok.shkandiuk.financyapp.models.common.FinanceState
import org.ok.shkandiuk.financyapp.models.transaction.*

fun FinancyContext.toTransportTransaction(): IResponse = when (val cmd = command) {
    FinanceCommand.CREATE -> toTransportCreate()
    FinanceCommand.READ -> toTransportRead()
    FinanceCommand.UPDATE -> toTransportUpdate()
    FinanceCommand.DELETE -> toTransportDelete()
    FinanceCommand.NONE -> throw UnknownFinanceCommand(cmd)
}

private fun FinancyContext.toTransportDelete() = TransactionDeleteResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == FinanceState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    transaction = transactionResponse.toTransportTransaction()
)

private fun FinancyContext.toTransportUpdate() = TransactionUpdateResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == FinanceState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    transaction = transactionResponse.toTransportTransaction()
)

private fun FinancyContext.toTransportCreate() = TransactionCreateResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == FinanceState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    transaction = transactionResponse.toTransportTransaction()
)

private fun FinanceTransaction.toTransportTransaction(): TransactionResponseObject = TransactionResponseObject(
    id = id.takeIf { it != FinanceTransactionId.NONE }?.asString(),
    title = title.takeIf { it.isNotBlank() },
    amount = amount.takeIf { it.isNotBlank() && it != "0" },
    transactionType = type.toTransportTransactionType(),
    transactionStatus = status.toTransportTransactionStatus(),
    ownerId = ownerId.asString(),
    permissions = permissionsClient.toTransportTransaction(),
)

private fun Set<FinanceTransactionPermissionClient>.toTransportTransaction(): Set<TransactionPermissions>? = this
    .map { it.toTransportTransaction() }
    .toSet()
    .takeIf { it.isNotEmpty() }

private fun FinanceTransactionPermissionClient.toTransportTransaction() = when (this) {
    FinanceTransactionPermissionClient.READ -> TransactionPermissions.READ
    FinanceTransactionPermissionClient.UPDATE -> TransactionPermissions.UPDATE
    FinanceTransactionPermissionClient.DELETE -> TransactionPermissions.DELETE
}

private fun FinanceTransactionStatus.toTransportTransactionStatus(): TransactionStatus? = when(this) {
    FinanceTransactionStatus.CONSTANT -> TransactionStatus.CONSTANT
    FinanceTransactionStatus.SINGLE -> TransactionStatus.SINGLE
    FinanceTransactionStatus.TEMPORAL -> TransactionStatus.TEMPORAL
    FinanceTransactionStatus.NONE -> null
}

private fun FinanceTransactionType.toTransportTransactionType(): TransactionType? = when(this) {
    FinanceTransactionType.INCOME -> TransactionType.INCOME
    FinanceTransactionType.OUTCOME -> TransactionType.OUTCOME
    FinanceTransactionType.NONE -> null
}

private fun FinancyContext.toTransportRead() = TransactionReadResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == FinanceState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    transaction = transactionResponse.toTransportTransaction()
)

private fun List<FinanceError>.toTransportErrors(): List<Error>? = this
    .map { it.toTransportTransaction() }
    .toList()
    .takeIf { it.isNotEmpty() }

private fun FinanceError.toTransportTransaction() = Error(
    code = code.takeIf { it.isNotBlank() },
    group = group.takeIf { it.isNotBlank() },
    field = field.takeIf { it.isNotBlank() },
    message = message.takeIf { it.isNotBlank() },
)
