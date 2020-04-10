package com.kpfu.itis.encyclopediaoftanks.data.model


import com.google.gson.annotations.SerializedName

data class Modules(
    @SerializedName("engine_id")
    var engineId: Int,
    @SerializedName("gun_id")
    var gunId: Int,
    @SerializedName("radio_id")
    var radioId: Int,
    @SerializedName("suspension_id")
    var suspensionId: Int,
    @SerializedName("turret_id")
    var turretId: Int
)