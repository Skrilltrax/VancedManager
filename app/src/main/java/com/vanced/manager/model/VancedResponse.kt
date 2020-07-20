package com.vanced.manager.model
import android.os.Parcelable

import kotlinx.android.parcel.Parcelize

import androidx.annotation.Keep

import com.squareup.moshi.JsonClass

import com.squareup.moshi.Json

@Parcelize
@Keep
@JsonClass(generateAdapter = true)
data class VancedResponse(
    @Json(name = "version") val version: String,
    @Json(name = "versionCode") val versionCode: Int
) : Parcelable