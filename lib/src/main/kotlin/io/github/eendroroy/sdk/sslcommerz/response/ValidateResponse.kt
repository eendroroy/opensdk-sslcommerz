package io.github.eendroroy.sdk.sslcommerz.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @author indrajit
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class ValidateResponse(
    @JsonProperty("status") val status: String?,
    @JsonProperty("tran_date") val tranDate: String?,
    @JsonProperty("tran_id") val tranId: String?,
    @JsonProperty("val_id") val valId: String?,
    @JsonProperty("amount") val amount: String?,
    @JsonProperty("store_amount") val storeAmount: String?,
    @JsonProperty("currency") val currency: String?,
    @JsonProperty("bank_tran_id") val bankTranId: String?,
    @JsonProperty("card_type") val cardType: String?,
    @JsonProperty("card_no") val cardNo: String?,
    @JsonProperty("card_issuer") val cardIssuer: String?,
    @JsonProperty("card_brand") val cardBrand: String?,
    @JsonProperty("card_issuer_country") val cardIssuerCountry: String?,
    @JsonProperty("card_issuer_country_code") val cardIssuerCountryCode: String?,
    @JsonProperty("currency_type") val currencyType: String?,
    @JsonProperty("currency_amount") val currencyAmount: String?,
    @JsonProperty("currency_rate") val currencyRate: String?,
    @JsonProperty("addition_charge") val additionCharge: String?,
    @JsonProperty("base_fair") val baseFair: String?,
    @JsonProperty("value_a") val valueA: String?,
    @JsonProperty("value_b") val valueB: String?,
    @JsonProperty("value_c") val valueC: String?,
    @JsonProperty("value_d") val valueD: String?,
    @JsonProperty("emi_instalment") val emiInstalment: String?,
    @JsonProperty("emi_amount") val emiAmount: String?,
    @JsonProperty("emi_description") val emiDescription: String?,
    @JsonProperty("emi_issuer") val emiIssuer: String?,
    @JsonProperty("account_details") val accountDetails: String?,
    @JsonProperty("risk_title") val riskTitle: String?,
    @JsonProperty("risk_level") val riskLevel: String?,
    @JsonProperty("discount_percentage") val discountPercentage: String?,
    @JsonProperty("discount_amount") val discountAmount: String?,
    @JsonProperty("discount_remarks") val discountRemarks: String?,
    @JsonProperty("isTokeizeSuccess") val isTokenizeSuccess: String?,
    @JsonProperty("campaign_code") val campaignCode: String?,
    @JsonProperty("APIConnect") val apiConnect: String?,
    @JsonProperty("validated_on") val validatedOn: String?,
    @JsonProperty("gw_version") val gwVersion: String?,
    @JsonProperty("card_ref_id") val cardRefId: String?,
    @JsonProperty("cus_name") val cusName: String?,
    @JsonProperty("cus_email") val cusEmail: String?,
    @JsonProperty("cus_phone") val cusPhone: String?
) : BaseResponse() {
    override fun httpResponseCode(httpResponseCode: Int): ValidateResponse {
        this.httpResponseCode = httpResponseCode
        return this
    }

    override fun httpResponseMessage(httpResponseMessage: String): ValidateResponse {
        this.httpResponseMessage = httpResponseMessage
        return this
    }
}
