package org.ok.shkandiuk.financyapp.models.common

class FinanceUserId(private val id: String) {
    fun asString() = id

    companion object {
        val NONE = FinanceUserId("")
    }
}
