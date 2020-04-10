package com.kpfu.itis.encyclopediaoftanks.data.model


import com.google.gson.annotations.SerializedName

data class TurretX(
    @SerializedName("hp")
    var hp: Int,
    @SerializedName("name")
    var name: String,
    @SerializedName("tag")
    var tag: String,
    @SerializedName("tier")
    var tier: Int,
    @SerializedName("traverse_left_arc")
    var traverseLeftArc: Int,
    @SerializedName("traverse_right_arc")
    var traverseRightArc: Int,
    @SerializedName("traverse_speed")
    var traverseSpeed: Int,
    @SerializedName("view_range")
    var viewRange: Int,
    @SerializedName("weight")
    var weight: Int
)