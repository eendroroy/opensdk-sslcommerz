package io.github.eendroroy.sdk.sslcommerz

import io.github.eendroroy.sdk.sslcommerz.client.OkHttpClientBuilder
import io.github.eendroroy.sdk.sslcommerz.client.OkHttpClientBuilder.builder
import io.github.eendroroy.sdk.sslcommerz.client.SSLPaymentClient
import io.github.eendroroy.sdk.sslcommerz.config.SSLConfiguration
import io.github.eendroroy.sdk.sslcommerz.config.trustingOkHttpClientBuilder
import io.github.eendroroy.sdk.sslcommerz.interceptor.DefaultSSLInterceptor
import io.github.eendroroy.sdk.sslcommerz.interceptor.SSLInterceptor
import io.github.eendroroy.sdk.sslcommerz.request.GwProcessRequest
import io.github.eendroroy.sdk.sslcommerz.response.GwProcessResponse
import io.github.eendroroy.sdk.sslcommerz.response.QuerySessionResponse
import io.github.eendroroy.sdk.sslcommerz.response.QueryTxnResponse
import io.github.eendroroy.sdk.sslcommerz.response.RefundResponse
import io.github.eendroroy.sdk.sslcommerz.response.RefundStatusResponse
import io.github.eendroroy.sdk.sslcommerz.response.ValidateResponse
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * @author indrajit
 */
class SSLApiClient @JvmOverloads constructor(
    private val config: SSLConfiguration,
    interceptor: SSLInterceptor = DefaultSSLInterceptor()
) {
    private val client = SSLPaymentClient(
        Retrofit.Builder()
            .client(
                builder(config.acceptUnsafeSSL())
                    .addInterceptor(interceptor)
                    .connectTimeout(config.timeOut(), TimeUnit.SECONDS)
                    .readTimeout(config.timeOut(), TimeUnit.SECONDS)
                    .build()
            )
            .baseUrl(config.baseUrl())
            .addConverterFactory(JacksonConverterFactory.create())
            .build()
    )

    @Throws(Exception::class)
    fun gwProcess(request: GwProcessRequest): GwProcessResponse? {
        request.apply {
            storeId = storeId ?: config.storeId()
            storePasswd = storePasswd ?: config.storePassword()
        }
        return client.gwProcess(request)
    }

    @JvmOverloads
    @Throws(Exception::class)
    fun validate(
        valId: String,
        storeId: String = config.storeId(),
        storePasswd: String = config.storePassword(),
        v: String? = null
    ): ValidateResponse? {
        return client.validate(valId, storeId, storePasswd, v)
    }

    @JvmOverloads
    @Throws(Exception::class)
    fun refund(
        bankTranId: String,
        refundAmount: String,
        refundRemarks: String,
        refId: String? = null,
        storeId: String = config.storeId(),
        storePasswd: String = config.storePassword()
    ): RefundResponse? {
        return client.refund(bankTranId, storeId, storePasswd, refundAmount, refundRemarks, refId)
    }

    @JvmOverloads
    @Throws(Exception::class)
    fun refundStatus(
        refundRefId: String,
        storeId: String = config.storeId(),
        storePasswd: String = config.storePassword()
    ): RefundStatusResponse? {
        return client.refundStatus(refundRefId, storeId, storePasswd)
    }

    @JvmOverloads
    @Throws(Exception::class)
    fun txnQueryBySession(
        sessionKey: String,
        storeId: String = config.storeId(),
        storePasswd: String = config.storePassword()
    ): QuerySessionResponse? {
        return client.txnQueryBySession(sessionKey, storeId, storePasswd)
    }

    @JvmOverloads
    @Throws(Exception::class)
    fun txnQueryById(
        tranId: String,
        storeId: String = config.storeId(),
        storePasswd: String = config.storePassword()
    ): QueryTxnResponse? {
        return client.txnQueryById(tranId, storeId, storePasswd)
    }
}
