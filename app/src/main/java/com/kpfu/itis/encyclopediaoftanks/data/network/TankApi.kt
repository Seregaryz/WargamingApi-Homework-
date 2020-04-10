package com.kpfu.itis.encyclopediaoftanks.data.network

import com.kpfu.itis.encyclopediaoftanks.data.model.TankResponce
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface TankApi {

    @GET("vehicles/")
    fun tankById(@Query("tank_id") tankId: Int): Observable<TankResponce>

    @GET("vehicles/")
    fun tanksList(@Query("limit") limit: Int, @Query("page_no") page: Int): Observable<TankResponce>

//    suspend fun getTanks(): Single<List<X1>>
//
//    suspend fun getTank(tankId: Int): Single<X1>
}