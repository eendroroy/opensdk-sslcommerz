package io.github.eendroroy.sdk.sslcommerz.exception

/**
 * @author indrajit
 */

class ConfigurationPropertyMissingError : RuntimeException {
    constructor() : super()
    constructor(message: String?) : super(message)
}
