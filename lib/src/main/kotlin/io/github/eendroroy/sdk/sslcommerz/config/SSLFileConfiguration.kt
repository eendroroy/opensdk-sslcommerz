package io.github.eendroroy.sdk.sslcommerz.config

import io.github.eendroroy.sdk.sslcommerz.exception.ConfigurationPropertyMissingError
import java.io.File
import java.io.FileReader
import java.util.Properties
import java.util.function.Consumer

/**
 * @author indrajit
 */
class SSLFileConfiguration private constructor(configLocation: String) : AbstractSSLConfiguration() {
    private val configLocation: String
    private val baseUrl: String
    private val storeId: String
    private val storePassword: String
    private val acceptUnsafeSSL: Boolean
    private val timeOut: Long

    private val requiredConfigKeys = listOf("baseUrl", "storeId", "storePassword")

    companion object {
        @JvmStatic
        @Throws(Exception::class)
        fun withConfig(configLocation: String): SSLConfiguration {
            return SSLFileConfiguration(configLocation)
        }
    }

    init {
        val config = File(configLocation)
        this.configLocation = config.absolutePath
        val properties = Properties()
        properties.load(FileReader(config))
        val keys = properties.stringPropertyNames()
        requiredConfigKeys.forEach(Consumer { propName: String ->
            if (!keys.contains(propName)) {
                throw ConfigurationPropertyMissingError(propName)
            }
        })

        baseUrl = properties.getProperty("baseUrl")
        storeId = properties.getProperty("storeId")
        storePassword = properties.getProperty("storePassword")
        acceptUnsafeSSL = properties.getProperty("acceptUnsafeSSL", "false")?.toBoolean() ?: false
        timeOut = properties.getProperty("timeOut", "30").toLong()
    }

    override fun baseUrl(): String {
        return baseUrl
    }

    override fun storeId(): String {
        return storeId
    }

    override fun storePassword(): String {
        return storePassword
    }

    override fun acceptUnsafeSSL(): Boolean {
        return acceptUnsafeSSL
    }

    override fun timeOut(): Long {
        return timeOut
    }
}
