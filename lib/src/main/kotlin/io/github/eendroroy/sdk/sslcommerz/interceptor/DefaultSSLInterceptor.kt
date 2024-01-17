package io.github.eendroroy.sdk.sslcommerz.interceptor

import okhttp3.Request
import okhttp3.Response

/**
 * @author indrajit
 */
class DefaultSSLInterceptor : AbstractSSLInterceptor() {
    override fun interceptRequest(request: Request): Request {
        return request
    }

    override fun interceptResponse(response: Response): Response {
        return response
    }
}
