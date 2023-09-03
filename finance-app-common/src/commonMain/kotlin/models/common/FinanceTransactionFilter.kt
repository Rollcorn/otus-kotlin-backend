package org.ok.shkandiuk.financyapp.models.common

import org.ok.shkandiuk.financyapp.models.transaction.FinanceTransactionStatus

data class FinanceTransactionFilter(
    var searchString: String = "",
    var ownerId: FinanceUserId = FinanceUserId.NONE,
    var financeTransactionStatus: FinanceTransactionStatus = FinanceTransactionStatus.NONE,
)
