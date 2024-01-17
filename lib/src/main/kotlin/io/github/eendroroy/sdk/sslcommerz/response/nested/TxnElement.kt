package io.github.eendroroy.sdk.sslcommerz.response.nested

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @author indrajit
 */
data class TxnElement(
    @JsonProperty("val_id") var valId: String? = null,
    @JsonProperty("status") var status: String? = null,
    @JsonProperty("validated_on") var validatedOn: String? = null,
    @JsonProperty("currency_type") var currencyType: String? = null,
    @JsonProperty("currency_amount") var currencyAmount: String? = null,
    @JsonProperty("currency_rate") var currencyRate: String? = null,
    @JsonProperty("base_fair") var baseFair: String? = null,
    @JsonProperty("value_a") var valueA: String? = null,
    @JsonProperty("value_b") var valueB: String? = null,
    @JsonProperty("value_c") var valueC: String? = null,
    @JsonProperty("value_d") var valueD: String? = null,
    @JsonProperty("discount_percentage") var discountPercentage: String? = null,
    @JsonProperty("discount_remarks") var discountRemarks: String? = null,
    @JsonProperty("discount_amount") var discountAmount: String? = null,
    @JsonProperty("tran_date") var tranDate: String? = null,
    @JsonProperty("tran_id") var tranId: String? = null,
    @JsonProperty("amount") var amount: String? = null,
    @JsonProperty("store_amount") var storeAmount: String? = null,
    @JsonProperty("bank_tran_id") var bankTranId: String? = null,
    @JsonProperty("card_type") var cardType: String? = null,
    @JsonProperty("risk_title") var riskTitle: String? = null,
    @JsonProperty("risk_level") var riskLevel: String? = null,
    @JsonProperty("currency") var currency: String? = null,
    @JsonProperty("bank_gw") var bankGw: String? = null,
    @JsonProperty("card_no") var cardNo: String? = null,
    @JsonProperty("card_issuer") var cardIssuer: String? = null,
    @JsonProperty("card_brand") var cardBrand: String? = null,
    @JsonProperty("card_issuer_country") var cardIssuerCountry: String? = null,
    @JsonProperty("card_issuer_country_code") var cardIssuerCountryCode: String? = null,
    @JsonProperty("gw_version") var gwVersion: String? = null,
    @JsonProperty("emi_instalment") var emiInstalment: String? = null,
    @JsonProperty("emi_amount") var emiAmount: String? = null,
    @JsonProperty("emi_description") var emiDescription: String? = null,
    @JsonProperty("emi_issuer") var emiIssuer: String? = null,
    @JsonProperty("error") var error: String? = null
)
