package com.kpfu.itis.encyclopediaoftanks.domain

import com.kpfu.itis.encyclopediaoftanks.data.network.ApiFactory
import com.kpfu.itis.encyclopediaoftanks.data.network.TankApi
import com.kpfu.itis.encyclopediaoftanks.domain.model.Mapper
import com.kpfu.itis.encyclopediaoftanks.domain.model.TankModel
import io.reactivex.Observable

class TankInteractorImpl(
    private val tankApi: TankApi
) : TankInteractor {

    override fun getTank(tankId: Int): Observable<TankModel> {
        return ApiFactory.tankApi.tankById(tankId).map{ t -> t.data.values.toList()}
            .flatMap { list ->
                Observable.fromIterable(list)
                    .map { item -> Mapper.toModel(item)}
            }

        }

    override fun getTanks(limit: Int, page: Int): Observable<MutableList<TankModel>> {
        return tankApi.tanksList(6, 1).map {t -> t.data.values.toList()}
            .flatMap {list ->
                Observable.fromIterable(list)
                    .map {item -> Mapper.toModel(item)}
                    .toList()
                    .toObservable()
            }
    }
}