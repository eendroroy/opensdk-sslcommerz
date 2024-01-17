package io.github.eendroroy.sdk.sslcommerz.definition

/**
 * @author indrajit
 */
enum class SSLGateWay(private val code: String, private val description: String) {
    BRAC_VISA("brac_visa", "BRAC VISA"),
    DBBL_VISA("dbbl_visa", "Dutch Bangla VISA"),
    CITY_VISA("city_visa", "City Bank Visa"),
    EBL_VISA("ebl_visa", "EBL Visa"),
    SBL_VISA("sbl_visa", "Southeast Bank Visa"),
    BRAC_MASTER("brac_master", "BRAC MASTER"),
    DBBL_MASTER("dbbl_master", "MASTER Dutch-Bangla"),
    CITY_MASTER("city_master", "City Master Card"),
    EBL_MASTER("ebl_master", "EBL Master Card"),
    SBL_MASTER("sbl_master", "Southeast Bank Master Card"),
    CITY_AMEX("city_amex", "City Bank AMEX"),
    QCASH("qcash", "QCash"),
    DBBL_NEXUS("dbbl_nexus", "DBBL Nexus"),
    BANK_ASIA("bankasia", "Bank Asia IB"),
    AB_BANK("abbank", "AB Bank IB"),
    IBBL("ibbl", "IBBL IB and Mobile Banking"),
    MTBL("mtbl", "Mutual Trust Bank IB"),
    BKASH("bkash", "Bkash Mobile Banking"),
    DBBL_MOBILE_BANKING("dbblmobilebanking", "DBBL Mobile Banking"),
    CITY("city", "City Touch IB"),
    U_PAY("upay", "Upay"),
    TAP_N_PAY("tapnpay", "Tap N Pay Gateway");

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
