package io.github.eendroroy.sdk.sslcommerz.definition

/**
 * @author indrajit
 */
enum class SSLGroupGateWay(private val code: String, private val description: String) {
    INTERNET_BANK("internetbank", "For all internet banking"),
    MOBILE_BANK("mobilebank", "For all mobile banking"),
    OTHER_CARD("othercard", "For all cards except visa,master and amex"),
    VISA_CARD("visacard", "For all visa"),
    MASTER_CARD("mastercard", "For All Master card"),
    AMEX_CARD("amexcard", "For Amex Card");

    fun code(): String {
        return code
    }

    fun description(): String {
        return description
    }

    override fun toString(): String {
        return code
    }
}
