package com.kpfu.itis.encyclopediaoftanks.data.model


import com.google.gson.annotations.SerializedName

data class Roles(
    @SerializedName("commander")
    var commander: String,
    @SerializedName("driver")
    var driver: String,
    @SerializedName("gunner")
    var gunner: String,
    @SerializedName("loader")
    var loader: String,
    @SerializedName("radioman")
    var radioman: String
)