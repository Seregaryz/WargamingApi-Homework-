package com.kpfu.itis.encyclopediaoftanks.data.model


import com.google.gson.annotations.SerializedName

data class Suspension(
    @SerializedName("load_limit")
    var loadLimit: Int,
    @SerializedName("name")
    var name: String,
    @SerializedName("steering_lock_angle")
    var steeringLockAngle: Int,
    @SerializedName("tag")
    var tag: String,
    @SerializedName("tier")
    var tier: Int,
    @SerializedName("traverse_speed")
    var traverseSpeed: Int,
    @SerializedName("weight")
    var weight: Int
)