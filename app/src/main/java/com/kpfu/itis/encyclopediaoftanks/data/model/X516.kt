package com.kpfu.itis.encyclopediaoftanks.data.model


import com.google.gson.annotations.SerializedName

data class X516(
    @SerializedName("is_default")
    var isDefault: Boolean,
    @SerializedName("module_id")
    var moduleId: Int,
    @SerializedName("name")
    var name: String,
    @SerializedName("next_modules")
    var nextModules: List<Int>,
    @SerializedName("next_tanks")
    var nextTanks: List<Int>,
    @SerializedName("price_credit")
    var priceCredit: Int,
    @SerializedName("price_xp")
    var priceXp: Int,
    @SerializedName("type")
    var type: String
)