package org.ok.shkandiuk.financyapp.models.common

import org.ok.shkandiuk.financyapp.models.transaction.TransactionStatus

data class FinancyTransactionFilter(
    var searchString: String = "",
    var ownerId: FinancyUserId = FinancyUserId.NONE,
    var transactionStatus: TransactionStatus = TransactionStatus.NONE,
)
