package com.example.materialdesign.repository

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NasaApiService {
    @GET("planetary/apod")
    fun getImage(@Query("api_key") apiKey: String): Call<NASAImageResponse>
}