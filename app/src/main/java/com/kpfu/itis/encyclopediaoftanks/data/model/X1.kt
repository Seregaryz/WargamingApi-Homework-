package com.kpfu.itis.encyclopediaoftanks.data.model


import com.google.gson.annotations.SerializedName

data class X1(
    @SerializedName("crew")
    var crew: List<Crew>,
    @SerializedName("default_profile")
    var defaultProfile: DefaultProfile,
    @SerializedName("description")
    var description: String,
    @SerializedName("engines")
    var engines: List<Int>,
    @SerializedName("guns")
    var guns: List<Int>,
    @SerializedName("images")
    var images: Images,
    @SerializedName("is_gift")
    var isGift: Boolean,
    @SerializedName("is_premium")
    var isPremium: Boolean,
    @SerializedName("is_premium_igr")
    var isPremiumIgr: Boolean,
    @SerializedName("is_wheeled")
    var isWheeled: Boolean,
    @SerializedName("modules_tree")
    var modulesTree: ModulesTree,
    @SerializedName("multination")
    var multination: Any,
    @SerializedName("name")
    var name: String,
    @SerializedName("nation")
    var nation: String,
    @SerializedName("next_tanks")
    var nextTanks: NextTanks,
    @SerializedName("price_credit")
    var priceCredit: Int,
    @SerializedName("price_gold")
    var priceGold: Int,
    @SerializedName("prices_xp")
    var pricesXp: PricesXp,
    @SerializedName("provisions")
    var provisions: List<Int>,
    @SerializedName("radios")
    var radios: List<Int>,
    @SerializedName("short_name")
    var shortName: String,
    @SerializedName("suspensions")
    var suspensions: List<Int>,
    @SerializedName("tag")
    var tag: String,
    @SerializedName("tank_id")
    var tankId: Int,
    @SerializedName("tier")
    var tier: Int,
    @SerializedName("turrets")
    var turrets: List<Int>,
    @SerializedName("type")
    var type: String
)