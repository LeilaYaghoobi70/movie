package com.example.remote.retrofit

import okhttp3.OkHttpClient

class MovieAokHttp {
    fun create(): OkHttpClient = OkHttpClient.Builder().build()
}