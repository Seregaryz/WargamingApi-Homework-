package com.kpfu.itis.encyclopediaoftanks.data.model


import com.google.gson.annotations.SerializedName

data class Images(
    @SerializedName("big_icon")
    var bigIcon: String,
    @SerializedName("contour_icon")
    var contourIcon: String,
    @SerializedName("small_icon")
    var smallIcon: String
)