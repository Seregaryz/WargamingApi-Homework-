package com.kpfu.itis.encyclopediaoftanks.domain.model

import com.kpfu.itis.encyclopediaoftanks.data.model.X1

data class TankModel (
    var tankId: Int,
    var name: String,
    var nation: String,
    var level: String,
    var type: String,
    var hp: String,
    var weight: String,
    var imgPath: String
)