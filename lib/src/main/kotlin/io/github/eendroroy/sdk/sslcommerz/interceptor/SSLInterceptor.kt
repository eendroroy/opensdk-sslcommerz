package io.github.eendroroy.sdk.sslcommerz.interceptor

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import java.io.IOException

/**
 * @author indrajit
 */
interface SSLInterceptor : Interceptor {
    @Throws(IOException::class)
    fun rawRequestBody(request: Request): String

    @Throws(IOException::class)
    fun rawResponseBody(response: Response): String
}
