package io.github.eendroroy.sdk.sslcommerz.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.eendroroy.sdk.sslcommerz.response.nested.TxnElement

/**
 * @author indrajit
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class QueryTxnResponse(
    @JsonProperty("APIConnect") val apiConnect: String?,
    @JsonProperty("no_of_trans_found") val noOfTransFound: Int?,
    @JsonProperty("element") val element: List<TxnElement>?

) : BaseResponse() {
    override fun httpResponseCode(httpResponseCode: Int): QueryTxnResponse {
        this.httpResponseCode = httpResponseCode
        return this
    }

    override fun httpResponseMessage(httpResponseMessage: String): QueryTxnResponse {
        this.httpResponseMessage = httpResponseMessage
        return this
    }
}
