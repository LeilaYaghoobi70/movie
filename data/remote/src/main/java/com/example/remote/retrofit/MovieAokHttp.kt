package com.example.remote.retrofit

import okhttp3.OkHttpClient

class MovieAokHttp {
    fun  create(): OkHttpClient{
        val clientBuilder = OkHttpClient.Builder()
        clientBuilder.addInterceptor(ApiKeyInterceptor(apiKey = ""))

        return clientBuilder.build()
    }
}