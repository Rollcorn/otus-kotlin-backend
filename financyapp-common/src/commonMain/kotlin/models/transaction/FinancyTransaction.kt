package org.ok.shkandiuk.financyapp.models.transaction

import org.ok.shkandiuk.financyapp.models.common.FinancyUserId

data class FinancyTransaction(
    var id: TransactionId = TransactionId.NONE,
    var title: String = "",
    var amount: Int = 0,
    var type: TransactionType = TransactionType.NONE,
    var status: TransactionStatus = TransactionStatus.SINGLE,
    var ownerId: FinancyUserId = FinancyUserId.NONE,
)
