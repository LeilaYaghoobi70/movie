package com.example.remote.retrofit

import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class AppRetrofit(
    private val okHttpClient: OkHttpClient,
    private val httpUrl: HttpUrl,
) {

    fun create(): Retrofit = Retrofit.Builder()
            .baseUrl(httpUrl)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create()).build()

}