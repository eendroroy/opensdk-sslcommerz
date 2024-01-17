package io.github.eendroroy.sdk.sslcommerz.response.nested

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @author indrajit
 */
data class DescResponse(
    @JsonProperty("name") var name: String? = null,
    @JsonProperty("type") var type: String? = null,
    @JsonProperty("logo") var logo: String? = null,
    @JsonProperty("gw") var gw: String? = null,
    @JsonProperty("transAmt") var transAmt: String? = null,
    @JsonProperty("payableAmt") var payableAmt: String? = null,
    @JsonProperty("charge") var charge: String? = null,
    @JsonProperty("r_flag") var rFlag: String? = null,
    @JsonProperty("autoselect") var autoSelect: String? = null,
    @JsonProperty("redirectGatewayURL") var redirectGatewayURL: String? = null
)
