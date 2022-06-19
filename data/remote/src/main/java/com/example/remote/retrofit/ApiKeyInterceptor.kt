package com.example.remote.retrofit

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class ApiKeyInterceptor(
  private val apiKey: String
): Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val requestBuilder: Request.Builder = chain.request().newBuilder()
        requestBuilder.header("Content-Type", apiKey)
        return chain.proceed(requestBuilder.build())
    }
}