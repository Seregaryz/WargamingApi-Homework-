package com.kpfu.itis.encyclopediaoftanks.data.model


import com.google.gson.annotations.SerializedName

data class Meta(
    @SerializedName("count")
    var count: Int,
    @SerializedName("limit")
    var limit: Int,
    @SerializedName("page")
    var page: Int,
    @SerializedName("page_total")
    var pageTotal: Int,
    @SerializedName("total")
    var total: Int
)