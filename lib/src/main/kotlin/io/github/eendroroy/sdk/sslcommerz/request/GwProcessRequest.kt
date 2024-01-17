package io.github.eendroroy.sdk.sslcommerz.request

import io.github.eendroroy.sdk.sslcommerz.definition.ProductProfile
import okhttp3.RequestBody

/**
 * @author indrajit
 */
data class GwProcessRequest(
    var storeId: String? = null,
    var storePasswd: String? = null,
    var totalAmount: String? = null,
    var currency: String? = null,
    var tranId: String? = null,
    var successUrl: String? = null,
    var failUrl: String? = null,
    var cancelUrl: String? = null,
    var ipnUrl: String? = null,
    var multiCardName: String? = null,
    var allowedBin: String? = null,

    var emiOption: String? = null,
    var emiMaxInstOption: String? = null,
    var emiSelectedInst: String? = null,
    var emiAllowOnly: String? = null,

    var cusName: String? = null,
    var cusEmail: String? = null,
    var cusAdd1: String? = null,
    var cusAdd2: String? = null,
    var cusCity: String? = null,
    var cusState: String? = null,
    var cusPostcode: String? = null,
    var cusCountry: String? = null,
    var cusPhone: String? = null,
    var cusFax: String? = null,

    var shippingMethod: String? = null,
    var numOfItem: String? = null,
    var shipName: String? = null,
    var shipAdd1: String? = null,
    var shipAdd2: String? = null,
    var shipCity: String? = null,
    var shipState: String? = null,
    var shipPostcode: String? = null,
    var shipCountry: String? = null,

    var productName: String? = null,
    var productCategory: String? = null,
    var productProfile: ProductProfile? = null,
    var hoursTillDeparture: String? = null,
    var flightType: String? = null,
    var pnr: String? = null,
    var journeyFromTo: String? = null,
    var thirdPartyBooking: String? = null,
    var hotelName: String? = null,
    var lengthOfStay: String? = null,
    var checkInTime: String? = null,
    var hotelCity: String? = null,
    var productType: String? = null,
    var topupNumber: String? = null,
    var countryTopup: String? = null,
    var cart: String? = null,
    var productAmount: String? = null,
    var vat: String? = null,
    var discountAmount: String? = null,
    var convenienceFee: String? = null,

    var valueA: String? = null,
    var valueB: String? = null,
    var valueC: String? = null,
    var valueD: String? = null
) {
    fun storeId(storeId: String) = apply { this.storeId = storeId }
    fun storePasswd(storePasswd: String) = apply { this.storePasswd = storePasswd }
    fun totalAmount(totalAmount: String) = apply { this.totalAmount = totalAmount }
    fun currency(currency: String?) = apply { this.currency = currency }
    fun tranId(tranId: String) = apply { this.tranId = tranId }
    fun successUrl(successUrl: String?) = apply { this.successUrl = successUrl }
    fun failUrl(failUrl: String?) = apply { this.failUrl = failUrl }
    fun cancelUrl(cancelUrl: String?) = apply { this.cancelUrl = cancelUrl }
    fun ipnUrl(ipnUrl: String?) = apply { this.ipnUrl = ipnUrl }
    fun multiCardName(multiCardName: String?) = apply { this.multiCardName = multiCardName }
    fun allowedBin(allowedBin: String?) = apply { this.allowedBin = allowedBin }

    fun emiOption(emiOption: String?) = apply { this.emiOption = emiOption }
    fun emiMaxInstOption(emiMaxInstOption: String?) = apply { this.emiMaxInstOption = emiMaxInstOption }
    fun emiSelectedInst(emiSelectedInst: String?) = apply { this.emiSelectedInst = emiSelectedInst }
    fun emiAllowOnly(emiAllowOnly: String?) = apply { this.emiAllowOnly = emiAllowOnly }

    fun cusName(cusName: String?) = apply { this.cusName = cusName }
    fun cusEmail(cusEmail: String?) = apply { this.cusEmail = cusEmail }
    fun cusAdd1(cusAdd1: String?) = apply { this.cusAdd1 = cusAdd1 }
    fun cusAdd2(cusAdd2: String?) = apply { this.cusAdd2 = cusAdd2 }
    fun cusCity(cusCity: String?) = apply { this.cusCity = cusCity }
    fun cusState(cusState: String?) = apply { this.cusState = cusState }
    fun cusPostcode(cusPostcode: String?) = apply { this.cusPostcode = cusPostcode }
    fun cusCountry(cusCountry: String?) = apply { this.cusCountry = cusCountry }
    fun cusPhone(cusPhone: String?) = apply { this.cusPhone = cusPhone }
    fun cusFax(cusFax: String?) = apply { this.cusFax = cusFax }

    fun shippingMethod(shippingMethod: String?) = apply { this.shippingMethod = shippingMethod }
    fun numOfItem(numOfItem: String?) = apply { this.numOfItem = numOfItem }
    fun shipName(shipName: String?) = apply { this.shipName = shipName }
    fun shipAdd1(shipAdd1: String?) = apply { this.shipAdd1 = shipAdd1 }
    fun shipAdd2(shipAdd2: String?) = apply { this.shipAdd2 = shipAdd2 }
    fun shipCity(shipCity: String?) = apply { this.shipCity = shipCity }
    fun shipState(shipState: String?) = apply { this.shipState = shipState }
    fun shipPostcode(shipPostcode: String?) = apply { this.shipPostcode = shipPostcode }
    fun shipCountry(shipCountry: String?) = apply { this.shipCountry = shipCountry }

    fun productName(productName: String?) = apply { this.productName = productName }
    fun productCategory(productCategory: String?) = apply { this.productCategory = productCategory }
    fun productProfile(productProfile: ProductProfile?) = apply { this.productProfile = productProfile }
    fun hoursTillDeparture(hoursTillDeparture: String?) = apply { this.hoursTillDeparture = hoursTillDeparture }
    fun flightType(flightType: String?) = apply { this.flightType = flightType }
    fun pnr(pnr: String?) = apply { this.pnr = pnr }
    fun journeyFromTo(journeyFromTo: String?) = apply { this.journeyFromTo = journeyFromTo }
    fun thirdPartyBooking(thirdPartyBooking: String?) = apply { this.thirdPartyBooking = thirdPartyBooking }
    fun hotelName(hotelName: String?) = apply { this.hotelName = hotelName }
    fun lengthOfStay(lengthOfStay: String?) = apply { this.lengthOfStay = lengthOfStay }
    fun checkInTime(checkInTime: String?) = apply { this.checkInTime = checkInTime }
    fun hotelCity(hotelCity: String?) = apply { this.hotelCity = hotelCity }
    fun productType(productType: String?) = apply { this.productType = productType }
    fun topupNumber(topupNumber: String?) = apply { this.topupNumber = topupNumber }
    fun countryTopup(countryTopup: String?) = apply { this.countryTopup = countryTopup }
    fun cart(cart: String?) = apply { this.cart = cart }
    fun productAmount(productAmount: String?) = apply { this.productAmount = productAmount }
    fun vat(vat: String?) = apply { this.vat = vat }
    fun discountAmount(discountAmount: String?) = apply { this.discountAmount = discountAmount }
    fun convenienceFee(convenienceFee: String?) = apply { this.convenienceFee = convenienceFee }

    fun valueA(valueA: String?) = apply { this.valueA = valueA }
    fun valueB(valueB: String?) = apply { this.valueB = valueB }
    fun valueC(valueC: String?) = apply { this.valueC = valueC }
    fun valueD(valueD: String?) = apply { this.valueD = valueD }

    fun getParts(): Map<String, RequestBody> {
        val parts = HashMap<String, RequestBody>()

        parts["store_id"] = RequestBody.create(null, storeId!!)
        parts["store_passwd"] = RequestBody.create(null, storePasswd!!)
        parts["total_amount"] = RequestBody.create(null, totalAmount!!)
        parts["tran_id"] = RequestBody.create(null, tranId!!)
        parts["cus_name"] = RequestBody.create(null, cusName!!)
        parts["cus_email"] = RequestBody.create(null, cusEmail!!)
        parts["cus_add1"] = RequestBody.create(null, cusAdd1!!)
        parts["cus_city"] = RequestBody.create(null, cusCity!!)
        parts["cus_postcode"] = RequestBody.create(null, cusPostcode!!)
        parts["cus_country"] = RequestBody.create(null, cusCountry!!)
        parts["cus_phone"] = RequestBody.create(null, cusPhone!!)
        parts["shipping_method"] = RequestBody.create(null, shippingMethod!!)
        parts["num_of_item"] = RequestBody.create(null, numOfItem!!)
        parts["product_name"] = RequestBody.create(null, productName!!)
        parts["product_category"] = RequestBody.create(null, productCategory!!)
        parts["product_profile"] = RequestBody.create(null, productProfile!!.value())
        parts["emi_option"] = RequestBody.create(null, emiOption!!)

        currency?.apply { parts["currency"] = RequestBody.create(null, currency!!) }
        successUrl?.apply { parts["success_url"] = RequestBody.create(null, successUrl!!) }
        failUrl?.apply { parts["fail_url"] = RequestBody.create(null, failUrl!!) }
        cancelUrl?.apply { parts["cancel_url"] = RequestBody.create(null, cancelUrl!!) }
        ipnUrl?.apply { parts["ipn_url"] = RequestBody.create(null, ipnUrl!!) }
        multiCardName?.apply {
            parts["multi_card_name"] = RequestBody.create(null, multiCardName!!)
        }
        allowedBin?.apply { parts["allowed_bin"] = RequestBody.create(null, allowedBin!!) }

        emiMaxInstOption?.apply {
            parts["emi_max_inst_option"] = RequestBody.create(null, emiMaxInstOption!!)
        }
        emiSelectedInst?.apply {
            parts["emi_selected_inst"] = RequestBody.create(null, emiSelectedInst!!)
        }
        emiAllowOnly?.apply {
            parts["emi_allow_only"] = RequestBody.create(null, emiAllowOnly!!)
        }

        cusAdd2?.apply { parts["cus_add2"] = RequestBody.create(null, cusAdd2!!) }
        cusState?.apply { parts["cus_state"] = RequestBody.create(null, cusState!!) }
        cusFax?.apply { parts["cus_fax"] = RequestBody.create(null, cusFax!!) }

        shipName?.apply { parts["ship_name"] = RequestBody.create(null, shipName!!) }
        shipAdd1?.apply { parts["ship_add1"] = RequestBody.create(null, shipAdd1!!) }
        shipAdd2?.apply { parts["ship_add2"] = RequestBody.create(null, shipAdd2!!) }
        shipCity?.apply { parts["ship_city"] = RequestBody.create(null, shipCity!!) }
        shipState?.apply { parts["ship_state"] = RequestBody.create(null, shipState!!) }
        shipPostcode?.apply {
            parts["ship_postcode"] = RequestBody.create(null, shipPostcode!!)
        }
        shipCountry?.apply { parts["ship_country"] = RequestBody.create(null, shipCountry!!) }
        hoursTillDeparture?.apply {
            parts["hours_till_departure"] = RequestBody.create(null, hoursTillDeparture!!)
        }
        flightType?.apply { parts["flight_type"] = RequestBody.create(null, flightType!!) }
        pnr?.apply { parts["pnr"] = RequestBody.create(null, pnr!!) }
        journeyFromTo?.apply {
            parts["journey_from_to"] = RequestBody.create(null, journeyFromTo!!)
        }
        thirdPartyBooking?.apply {
            parts["third_party_booking"] = RequestBody.create(null, thirdPartyBooking!!)
        }
        hotelName?.apply { parts["hotel_name"] = RequestBody.create(null, hotelName!!) }
        lengthOfStay?.apply {
            parts["length_of_stay"] = RequestBody.create(null, lengthOfStay!!)
        }
        checkInTime?.apply { parts["check_in_time"] = RequestBody.create(null, checkInTime!!) }
        hotelCity?.apply { parts["hotel_city"] = RequestBody.create(null, hotelCity!!) }
        productType?.apply { parts["product_type"] = RequestBody.create(null, productType!!) }
        topupNumber?.apply { parts["topup_number"] = RequestBody.create(null, topupNumber!!) }
        countryTopup?.apply {
            parts["country_topup"] = RequestBody.create(null, countryTopup!!)
        }
        cart?.apply { parts["cart"] = RequestBody.create(null, cart!!) }
        productAmount?.apply {
            parts["product_amount"] = RequestBody.create(null, productAmount!!)
        }
        vat?.apply { parts["vat"] = RequestBody.create(null, vat!!) }
        discountAmount?.apply {
            parts["discount_amount"] = RequestBody.create(null, discountAmount!!)
        }
        convenienceFee?.apply {
            parts["convenience_fee"] = RequestBody.create(null, convenienceFee!!)
        }

        valueA?.apply { parts["value_a"] = RequestBody.create(null, valueA!!) }
        valueB?.apply { parts["value_b"] = RequestBody.create(null, valueB!!) }
        valueC?.apply { parts["value_c"] = RequestBody.create(null, valueC!!) }
        valueD?.apply { parts["value_d"] = RequestBody.create(null, valueD!!) }

        return parts
    }
}
