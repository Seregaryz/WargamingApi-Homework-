package com.kpfu.itis.encyclopediaoftanks.data.model


import com.google.gson.annotations.SerializedName

data class DefaultProfile(
    @SerializedName("ammo")
    var ammo: List<Ammo>,
    @SerializedName("armor")
    var armor: Armor,
    @SerializedName("engine")
    var engine: Engine,
    @SerializedName("gun")
    var gun: Gun,
    @SerializedName("hp")
    var hp: Int,
    @SerializedName("hull_hp")
    var hullHp: Int,
    @SerializedName("hull_weight")
    var hullWeight: Int,
    @SerializedName("max_ammo")
    var maxAmmo: Int,
    @SerializedName("max_weight")
    var maxWeight: Int,
    @SerializedName("modules")
    var modules: Modules,
    @SerializedName("radio")
    var radio: Radio,
    @SerializedName("rapid")
    var rapid: Any,
    @SerializedName("siege")
    var siege: Any,
    @SerializedName("speed_backward")
    var speedBackward: Int,
    @SerializedName("speed_forward")
    var speedForward: Int,
    @SerializedName("suspension")
    var suspension: Suspension,
    @SerializedName("turret")
    var turret: TurretX,
    @SerializedName("weight")
    var weight: Int
)