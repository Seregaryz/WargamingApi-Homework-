package com.kpfu.itis.encyclopediaoftanks.data.model


import com.google.gson.annotations.SerializedName

data class Ammo(
    @SerializedName("damage")
    var damage: List<Int>,
    @SerializedName("penetration")
    var penetration: List<Int>,
    @SerializedName("stun")
    var stun: Any,
    @SerializedName("type")
    var type: String
)