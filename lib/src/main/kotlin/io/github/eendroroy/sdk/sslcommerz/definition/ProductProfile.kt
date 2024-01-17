package io.github.eendroroy.sdk.sslcommerz.definition

/**
 * @author indrajit
 */
enum class ProductProfile(private val value: String) {
    GENERAL("general"),
    PHYSICAL_GOODS("physical-goods"),
    NON_PHYSICAL_GOODS("non-physical-goods"),
    AIRLINE_TICKETS("airline-tickets"),
    TRAVEL_VERTICAL("travel-vertical"),
    TELECOM_VERTICAL("telecom-vertical");

    fun value(): String {
        return value
    }

    override fun toString(): String {
        return value
    }
}
