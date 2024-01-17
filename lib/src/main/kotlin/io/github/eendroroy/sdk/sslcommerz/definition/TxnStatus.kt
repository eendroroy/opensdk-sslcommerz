package io.github.eendroroy.sdk.sslcommerz.definition

/**
 * @author indrajit
 */
enum class TxnStatus {
    SUCCESS, VALID, VALIDATED, PENDING, UNATTEMPTED, EXPIRED, INVALID_TRANSACTION, CANCELLED, FAILED;

    override fun toString(): String {
        return name
    }
}
