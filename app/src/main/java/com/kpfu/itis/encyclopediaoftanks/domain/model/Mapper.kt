package com.kpfu.itis.encyclopediaoftanks.domain.model

import com.kpfu.itis.encyclopediaoftanks.data.model.X1

class Mapper {

    companion object {
        fun toModel(item: X1): TankModel {
            return TankModel(
                item.tankId,
                item.name,
                item.nation,
                item.tier.toString(),
                item.type,
                item.defaultProfile.hp.toString(),
                item.defaultProfile.weight.toString() + " t.",
                item.images.bigIcon.replace("http", "https")
            )
        }
    }
}