package org.ok.shkandiuk.financyapp.models.common

import kotlin.jvm.JvmInline

@JvmInline
value class FinancyRequestId(private val id: String) {
    fun asString() = id

    companion object {
        val NONE = FinancyRequestId("")
    }
}