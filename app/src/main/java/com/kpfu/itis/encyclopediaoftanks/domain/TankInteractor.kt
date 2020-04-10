package com.kpfu.itis.encyclopediaoftanks.domain

import com.kpfu.itis.encyclopediaoftanks.data.model.X1
import com.kpfu.itis.encyclopediaoftanks.domain.model.TankModel
import io.reactivex.Observable
import io.reactivex.Single

interface TankInteractor {

    fun getTank(tankId: Int): Observable<TankModel>

    fun getTanks(limit: Int, page: Int): Observable<MutableList<TankModel>>
}