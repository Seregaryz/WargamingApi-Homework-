package com.kpfu.itis.encyclopediaoftanks.data.model


import com.google.gson.annotations.SerializedName

data class Tank(
    @SerializedName("data")
    var `data`: Data,
    @SerializedName("meta")
    var meta: Meta,
    @SerializedName("status")
    var status: String
)