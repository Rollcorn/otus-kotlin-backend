package org.ok.shkandiuk.financyapp.models.common

class FinancyUserId(private val id: String) {
    fun asString() = id

    companion object {
        val NONE = FinancyUserId("")
    }
}
