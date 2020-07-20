package com.vanced.manager.core.api

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitInstance {

    private lateinit var retrofit: Retrofit
    public const val baseUrl = "https://vanced.app/api/v1"

    fun getInstance() : Retrofit {
        if (!this::retrofit.isInitialized) {
            retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
        }

        return retrofit;
    }
}