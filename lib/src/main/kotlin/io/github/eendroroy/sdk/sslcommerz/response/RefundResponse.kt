package io.github.eendroroy.sdk.sslcommerz.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @author indrajit
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class RefundResponse(
    @JsonProperty("APIConnect") val apiConnect: String?,
    @JsonProperty("bank_tran_id") val bankTranId: String?,
    @JsonProperty("trans_id") val transId: String?,
    @JsonProperty("refund_ref_id") val refundRefId: String?,
    @JsonProperty("status") val status: String?,
    @JsonProperty("errorReason") val errorReason: String?
) : BaseResponse() {
    override fun httpResponseCode(httpResponseCode: Int): RefundResponse {
        this.httpResponseCode = httpResponseCode
        return this
    }

    override fun httpResponseMessage(httpResponseMessage: String): RefundResponse {
        this.httpResponseMessage = httpResponseMessage
        return this
    }
}
