package org.ok.shkandiuk.financyapp.models.transaction

class TransactionId(private val id: String) {
    fun asString() = id

    companion object {
        val NONE = TransactionId("")
    }
}
