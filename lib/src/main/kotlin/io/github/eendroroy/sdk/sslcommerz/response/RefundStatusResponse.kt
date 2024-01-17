package io.github.eendroroy.sdk.sslcommerz.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @author indrajit
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class RefundStatusResponse(
    @JsonProperty("APIConnect") val apiConnect: String?,
    @JsonProperty("bank_tran_id") val bankTranId: String?,
    @JsonProperty("tran_id") val tranId: String?,
    @JsonProperty("initiated_on") val initiatedOn: String?,
    @JsonProperty("refunded_on") val refundedOn: String?,
    @JsonProperty("status") val status: String?,
    @JsonProperty("refund_ref_id") val refundRefId: String?
) : BaseResponse() {
    override fun httpResponseCode(httpResponseCode: Int): RefundStatusResponse {
        this.httpResponseCode = httpResponseCode
        return this
    }

    override fun httpResponseMessage(httpResponseMessage: String): RefundStatusResponse {
        this.httpResponseMessage = httpResponseMessage
        return this
    }
}
