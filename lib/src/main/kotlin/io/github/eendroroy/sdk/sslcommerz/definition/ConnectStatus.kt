package io.github.eendroroy.sdk.sslcommerz.definition

/**
 * @author indrajit
 */
enum class ConnectStatus {
    REQUEST_FROM_INVALID_SOURCE, INVALID_REQUEST, FAILED, INACTIVE, DONE;

    override fun toString(): String {
        return name
    }
}
