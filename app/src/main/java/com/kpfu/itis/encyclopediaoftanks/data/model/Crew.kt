package com.kpfu.itis.encyclopediaoftanks.data.model


import com.google.gson.annotations.SerializedName

data class Crew(
    @SerializedName("member_id")
    var memberId: String,
    @SerializedName("roles")
    var roles: Roles
)