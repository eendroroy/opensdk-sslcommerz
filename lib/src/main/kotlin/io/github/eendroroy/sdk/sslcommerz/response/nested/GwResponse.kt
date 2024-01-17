package io.github.eendroroy.sdk.sslcommerz.response.nested

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @author indrajit
 */
data class GwResponse(
    @JsonProperty("visa") var visa: String? = null,
    @JsonProperty("master") var master: String? = null,
    @JsonProperty("amex") var amex: String? = null,
    @JsonProperty("othercards") var othercards: String? = null,
    @JsonProperty("internetbanking") var internetbanking: String? = null,
    @JsonProperty("mobilebanking") var mobilebanking: String? = null
)
