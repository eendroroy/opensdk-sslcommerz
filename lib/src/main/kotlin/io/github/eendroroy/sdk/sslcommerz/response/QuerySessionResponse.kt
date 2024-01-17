package io.github.eendroroy.sdk.sslcommerz.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @author indrajit
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class QuerySessionResponse(
    @JsonProperty("APIConnect") val apiConnect: String?,
    @JsonProperty("status") val status: String?,
    @JsonProperty("sessionkey") val sessionKey: String?,
    @JsonProperty("tran_date") val tranDate: String?,
    @JsonProperty("tran_id") val traId: String?,
    @JsonProperty("val_id") val valId: String?,
    @JsonProperty("amount") val amount: String?,
    @JsonProperty("store_amount") val storeAmount: String?,
    @JsonProperty("card_type") val cardType: String?,
    @JsonProperty("card_no") val cardNo: String?,
    @JsonProperty("currency") val currency: String?,
    @JsonProperty("bank_tran_id") val bankTranId: String?,
    @JsonProperty("card_issuer") val cardIssuer: String?,
    @JsonProperty("card_brand") val cardBrand: String?,
    @JsonProperty("card_issuer_country") val cardIssuerCountry: String?,
    @JsonProperty("card_issuer_country_code") val cardIssuerCountryCode: String?,
    @JsonProperty("currency_type") val currencyType: String?,
    @JsonProperty("currency_amount") val currencyAmount: String?,
    @JsonProperty("currency_rate") val currencyRate: String?,
    @JsonProperty("emi_instalment") val emiInstalment: String?,
    @JsonProperty("emi_amount") val emiAmount: String?,
    @JsonProperty("discount_percentage") val discountPercentage: String?,
    @JsonProperty("discount_remarks") val discountRemarks: String?,
    @JsonProperty("base_fair") val baseFair: String?,
    @JsonProperty("value_a") val valueA: String?,
    @JsonProperty("value_b") val valueB: String?,
    @JsonProperty("value_c") val valueC: String?,
    @JsonProperty("value_d") val valueD: String?,
    @JsonProperty("risk_level") val riskLevel: String?,
    @JsonProperty("risk_title") val riskTitle: String,
    @JsonProperty("validated_on") val validatedOn: String,
    @JsonProperty("gw_version") val gwVersion: String
) : BaseResponse() {
    override fun httpResponseCode(httpResponseCode: Int): QuerySessionResponse {
        this.httpResponseCode = httpResponseCode
        return this
    }

    override fun httpResponseMessage(httpResponseMessage: String): QuerySessionResponse {
        this.httpResponseMessage = httpResponseMessage
        return this
    }
}
