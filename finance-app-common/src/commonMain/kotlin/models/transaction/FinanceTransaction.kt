package org.ok.shkandiuk.financyapp.models.transaction

import org.ok.shkandiuk.financyapp.models.common.FinanceUserId

data class FinanceTransaction(
    var id: FinanceTransactionId = FinanceTransactionId.NONE,
    var title: String = "",
    var amount: String = "0",
    var type: FinanceTransactionType = FinanceTransactionType.NONE,
    var status: FinanceTransactionStatus = FinanceTransactionStatus.SINGLE,
    var ownerId: FinanceUserId = FinanceUserId.NONE,
    val permissionsClient: MutableSet<FinanceTransactionPermissionClient> = mutableSetOf()
)
