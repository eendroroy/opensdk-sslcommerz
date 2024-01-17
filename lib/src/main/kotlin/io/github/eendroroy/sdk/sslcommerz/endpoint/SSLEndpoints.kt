package io.github.eendroroy.sdk.sslcommerz.endpoint

import io.github.eendroroy.sdk.sslcommerz.response.GwProcessResponse
import io.github.eendroroy.sdk.sslcommerz.response.QuerySessionResponse
import io.github.eendroroy.sdk.sslcommerz.response.QueryTxnResponse
import io.github.eendroroy.sdk.sslcommerz.response.RefundResponse
import io.github.eendroroy.sdk.sslcommerz.response.RefundStatusResponse
import io.github.eendroroy.sdk.sslcommerz.response.ValidateResponse
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.PartMap
import retrofit2.http.Query

/**
 * @author indrajit
 */
interface SSLEndpoints {
    @Multipart
    @POST("/gwprocess/v4/api.php")
    fun gwProcess(
        @PartMap request: Map<String, @JvmSuppressWildcards RequestBody>
    ): Call<GwProcessResponse?>

    @GET("/validator/api/validationserverAPI.php")
    fun validate(
        @Query("val_id") valId: String,
        @Query("store_id") storeId: String,
        @Query("store_passwd") storePasswd: String,
        @Query("format") format: String = "json",
        @Query("v") v: String?
    ): Call<ValidateResponse?>

    @GET("/validator/api/merchantTransIDvalidationAPI.php")
    fun refund(
        @Query("bank_tran_id") bankTranId: String,
        @Query("store_id") storeId: String,
        @Query("store_passwd") storePasswd: String,
        @Query("refund_amount") refundAmount: String,
        @Query("refund_remarks") refundRemarks: String,
        @Query("refe_id") refId: String?
    ): Call<RefundResponse?>

    @GET("/validator/api/merchantTransIDvalidationAPI.php")
    fun refundStatus(
        @Query("refund_ref_id") refundRefId: String,
        @Query("store_id") storeId: String,
        @Query("store_passwd") storePasswd: String
    ): Call<RefundStatusResponse?>

    @GET("/validator/api/merchantTransIDvalidationAPI.php")
    fun txnQueryBySession(
        @Query("sessionkey") sessionKey: String,
        @Query("store_id") storeId: String,
        @Query("store_passwd") storePasswd: String
    ): Call<QuerySessionResponse?>

    @GET("/validator/api/merchantTransIDvalidationAPI.php")
    fun txnQueryById(
        @Query("tran_id") tranId: String,
        @Query("store_id") storeId: String,
        @Query("store_passwd") storePasswd: String
    ): Call<QueryTxnResponse?>
}
