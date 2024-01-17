package io.github.eendroroy.sdk.sslcommerz.definition

/**
 * @author indrajit
 */
enum class CardBrand(private val value: String) {
    VISA("VISA"), MASTER("MASTER"), AMEX("AMEX"), IB("IB"), MOBILE_BANKING("MOBILE BANKING");

    fun value(): String {
        return value
    }

    override fun toString(): String {
        return value
    }
}
