package io.github.eendroroy.sdk.sslcommerz.config

/**
 * @author indrajit
 */
interface SSLConfiguration {
    fun baseUrl(): String
    fun storeId(): String
    fun storePassword(): String

    // HTTP
    fun acceptUnsafeSSL(): Boolean
    fun timeOut(): Long
}
