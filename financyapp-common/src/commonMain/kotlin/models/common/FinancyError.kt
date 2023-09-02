package org.ok.shkandiuk.financyapp.models.common

data class FinancyError(
    val code: String = "",
    val group: String = "",
    val field: String = "",
    val message: String = "",
    val exception: Throwable? = null,
)