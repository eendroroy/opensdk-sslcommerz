package io.github.eendroroy.sdk.sslcommerz.definition

/**
 * @author indrajit
 */
enum class RefundStatus {
    success, processing, refunded, cancelled, failed;

    override fun toString(): String {
        return name
    }
}
