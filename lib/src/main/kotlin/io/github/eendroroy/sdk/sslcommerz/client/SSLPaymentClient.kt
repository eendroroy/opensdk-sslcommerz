package io.github.eendroroy.sdk.sslcommerz.client

import io.github.eendroroy.sdk.sslcommerz.converter.ResponseConverter
import io.github.eendroroy.sdk.sslcommerz.endpoint.SSLEndpoints
import io.github.eendroroy.sdk.sslcommerz.request.GwProcessRequest
import io.github.eendroroy.sdk.sslcommerz.response.GwProcessResponse
import io.github.eendroroy.sdk.sslcommerz.response.QuerySessionResponse
import io.github.eendroroy.sdk.sslcommerz.response.QueryTxnResponse
import io.github.eendroroy.sdk.sslcommerz.response.RefundResponse
import io.github.eendroroy.sdk.sslcommerz.response.RefundStatusResponse
import io.github.eendroroy.sdk.sslcommerz.response.ValidateResponse
import retrofit2.Retrofit

/**
 * @author indrajit
 */
class SSLPaymentClient(private val retrofit: Retrofit) {
    private val endpoints: SSLEndpoints = retrofit.create(SSLEndpoints::class.java)

    @Throws(Exception::class)
    fun gwProcess(request: GwProcessRequest): GwProcessResponse? {
        val response = endpoints.gwProcess(request.getParts()).execute()
        return ResponseConverter(retrofit, response).convert()
    }

    @Throws(Exception::class)
    fun validate(valId: String, storeId: String, storePasswd: String, v: String?): ValidateResponse? {
        val response = endpoints.validate(valId, storeId, storePasswd, v = v).execute()
        return ResponseConverter(retrofit, response).convert()
    }

    @Throws(Exception::class)
    fun refund(
        bankTranId: String,
        storeId: String,
        storePasswd: String,
        refundAmount: String,
        refundRemarks: String,
        refId: String?
    ): RefundResponse? {
        val response = endpoints.refund(
            bankTranId, storeId, storePasswd, refundAmount, refundRemarks, refId
        ).execute()
        return ResponseConverter(retrofit, response).convert()
    }

    @Throws(Exception::class)
    fun refundStatus(refundRefId: String, storeId: String, storePasswd: String): RefundStatusResponse? {
        val response = endpoints.refundStatus(refundRefId, storeId, storePasswd).execute()
        return ResponseConverter(retrofit, response).convert()
    }

    @Throws(Exception::class)
    fun txnQueryBySession(sessionKey: String, storeId: String, storePasswd: String): QuerySessionResponse? {
        val response = endpoints.txnQueryBySession(sessionKey, storeId, storePasswd).execute()
        return ResponseConverter(retrofit, response).convert()
    }

    @Throws(Exception::class)
    fun txnQueryById(tranId: String, storeId: String, storePasswd: String): QueryTxnResponse? {
        val response = endpoints.txnQueryById(tranId, storeId, storePasswd).execute()
        return ResponseConverter(retrofit, response).convert()
    }
}
