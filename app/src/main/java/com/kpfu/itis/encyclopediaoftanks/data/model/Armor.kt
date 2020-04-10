package com.kpfu.itis.encyclopediaoftanks.data.model


import com.google.gson.annotations.SerializedName

data class Armor(
    @SerializedName("hull")
    var hull: Hull,
    @SerializedName("turret")
    var turret: Turret
)