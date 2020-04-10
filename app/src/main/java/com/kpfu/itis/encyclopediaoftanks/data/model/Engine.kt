package com.kpfu.itis.encyclopediaoftanks.data.model


import com.google.gson.annotations.SerializedName

data class Engine(
    @SerializedName("fire_chance")
    var fireChance: Double,
    @SerializedName("name")
    var name: String,
    @SerializedName("power")
    var power: Int,
    @SerializedName("tag")
    var tag: String,
    @SerializedName("tier")
    var tier: Int,
    @SerializedName("weight")
    var weight: Int
)