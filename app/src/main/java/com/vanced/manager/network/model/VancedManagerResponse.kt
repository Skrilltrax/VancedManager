package com.vanced.manager.network.model
import android.os.Parcelable

import kotlinx.android.parcel.Parcelize

import androidx.annotation.Keep

import com.squareup.moshi.JsonClass

import com.squareup.moshi.Json

@Parcelize
@Keep
@JsonClass(generateAdapter = true)
data class VancedManagerResponse(
    @Json(name = "changelog") val changelog: String,
    @Json(name = "url") val url: String,
    @Json(name = "version") val version: String,
    @Json(name = "versionCode") val versionCode: Int
) : Parcelable