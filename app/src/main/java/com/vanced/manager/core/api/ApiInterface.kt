package com.vanced.manager.core.api

import com.vanced.manager.model.MicroGResponse
import com.vanced.manager.model.VancedManagerResponse
import com.vanced.manager.model.VancedResponse
import retrofit2.http.GET

interface ApiInterface {

    @GET
    fun getVancedManagerVersion(): VancedManagerResponse

    @GET
    fun getVancedVersion(): VancedResponse

    @GET
    fun getMicroGVersion(): MicroGResponse

    companion object {
        fun getClient(): ApiInterface = RetrofitInstance
            .getInstance()
            .create(ApiInterface::class.java)
    }
}