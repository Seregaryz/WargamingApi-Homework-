package com.kpfu.itis.encyclopediaoftanks.data.model


import com.google.gson.annotations.SerializedName

data class Turret(
    @SerializedName("front")
    var front: Int,
    @SerializedName("rear")
    var rear: Int,
    @SerializedName("sides")
    var sides: Int
)