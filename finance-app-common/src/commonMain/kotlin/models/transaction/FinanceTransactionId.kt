package org.ok.shkandiuk.financyapp.models.transaction

import kotlin.jvm.JvmInline

@JvmInline
value class FinanceTransactionId(private val id: String) {
    fun asString() = id

    companion object {
        val NONE = FinanceTransactionId("")
    }
}
