package io.github.eendroroy.sdk.sslcommerz.config

/**
 * @author indrajit
 */
abstract class AbstractSSLConfiguration : SSLConfiguration {
    override fun acceptUnsafeSSL(): Boolean {
        return false
    }

    override fun timeOut(): Long {
        return 60L
    }
}
