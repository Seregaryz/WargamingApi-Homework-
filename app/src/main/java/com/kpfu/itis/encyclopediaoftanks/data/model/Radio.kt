package com.kpfu.itis.encyclopediaoftanks.data.model


import com.google.gson.annotations.SerializedName

data class Radio(
    @SerializedName("name")
    var name: String,
    @SerializedName("signal_range")
    var signalRange: Int,
    @SerializedName("tag")
    var tag: String,
    @SerializedName("tier")
    var tier: Int,
    @SerializedName("weight")
    var weight: Int
)