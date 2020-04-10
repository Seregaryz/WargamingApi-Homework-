package com.kpfu.itis.encyclopediaoftanks.data.model


import com.google.gson.annotations.SerializedName

data class Gun(
    @SerializedName("aim_time")
    var aimTime: Double,
    @SerializedName("caliber")
    var caliber: Int,
    @SerializedName("dispersion")
    var dispersion: Double,
    @SerializedName("fire_rate")
    var fireRate: Double,
    @SerializedName("move_down_arc")
    var moveDownArc: Int,
    @SerializedName("move_up_arc")
    var moveUpArc: Int,
    @SerializedName("name")
    var name: String,
    @SerializedName("reload_time")
    var reloadTime: Double,
    @SerializedName("tag")
    var tag: String,
    @SerializedName("tier")
    var tier: Int,
    @SerializedName("traverse_speed")
    var traverseSpeed: Int,
    @SerializedName("weight")
    var weight: Int
)