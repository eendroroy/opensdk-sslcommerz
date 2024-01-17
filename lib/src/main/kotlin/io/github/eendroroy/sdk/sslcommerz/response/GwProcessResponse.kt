package io.github.eendroroy.sdk.sslcommerz.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.eendroroy.sdk.sslcommerz.response.nested.DescResponse
import io.github.eendroroy.sdk.sslcommerz.response.nested.DesignResponse
import io.github.eendroroy.sdk.sslcommerz.response.nested.GwResponse

/**
 * @author indrajit
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class GwProcessResponse(
    @JsonProperty("status") val status: String?,
    @JsonProperty("failedreason") val failedReason: String?,
    @JsonProperty("amount") val amount: String?,
    @JsonProperty("currency") val currency: String?,
    @JsonProperty("sessionkey") val sessionKey: String?,
    @JsonProperty("gw") val gw: GwResponse?,
    @JsonProperty("redirectGatewayURL") val redirectGatewayUrl: String?,
    @JsonProperty("GatewayPageURL") val gatewayPageUrl: String?,
    @JsonProperty("directPaymentURL") val directPaymentUrl: String?,

    @JsonProperty("design") val design: DesignResponse?,

    @JsonProperty("storeBanner") val storeBanner: String?,
    @JsonProperty("storeLogo") val storeLogo: String?,
    @JsonProperty("desc") val desc: List<DescResponse>?,
    @JsonProperty("tran_id") val tranId: String?,
    @JsonProperty("is_direct_pay_enable") val isDirectPayEnable: String?,
    @JsonProperty("payByNewCardURL") val payByNewCardURL: String?,
    @JsonProperty("emi_status") val emiStatus: Int?,
    @JsonProperty("offer_status") val offerStatus: Int?,

    @JsonProperty("directPaymentURLBank") val directPaymentUrlBank: String?,
    @JsonProperty("directPaymentURLCard") val directPaymentUrlCard: String?,
    @JsonProperty("redirectGatewayURLFailed") val redirectGatewayUrlFailed: String?,
    @JsonProperty("store_name") val storeName: String?
) : BaseResponse() {
    override fun httpResponseCode(httpResponseCode: Int): GwProcessResponse {
        this.httpResponseCode = httpResponseCode
        return this
    }

    override fun httpResponseMessage(httpResponseMessage: String): GwProcessResponse {
        this.httpResponseMessage = httpResponseMessage
        return this
    }
}
