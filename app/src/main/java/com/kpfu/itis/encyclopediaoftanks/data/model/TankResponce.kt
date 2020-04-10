package com.kpfu.itis.encyclopediaoftanks.data.model

import com.google.gson.annotations.SerializedName
import com.kpfu.itis.encyclopediaoftanks.data.model.Meta
import com.kpfu.itis.encyclopediaoftanks.data.model.X1

data class TankResponce(
    @SerializedName("status")
    var status: String,
    @SerializedName("meta")
    var meta: Meta,
    @SerializedName("data")
    var data: HashMap<String, X1>
)