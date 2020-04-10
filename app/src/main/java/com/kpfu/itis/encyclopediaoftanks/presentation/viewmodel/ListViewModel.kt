package com.kpfu.itis.encyclopediaoftanks.presentation.viewmodel

import android.content.Intent
import androidx.annotation.MainThread
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.kpfu.itis.encyclopediaoftanks.data.model.X1
import com.kpfu.itis.encyclopediaoftanks.data.network.TankApi
import com.kpfu.itis.encyclopediaoftanks.domain.TankInteractor
import com.kpfu.itis.encyclopediaoftanks.domain.model.TankModel
import com.kpfu.itis.encyclopediaoftanks.presentation.base.BaseViewModel
import com.kpfu.itis.encyclopediaoftanks.presentation.view.DetailsActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ListViewModel(
    private val tankInteractor: TankInteractor
): BaseViewModel() {

    private val tankMutableLiveData = MutableLiveData<List<TankModel>>()
    val tankLiveData: LiveData<List<TankModel>> = tankMutableLiveData

    fun getTanks(){
        disposables.add(
            tankInteractor.getTanks(5, 1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    tankMutableLiveData.value = it.toList()
                }, {
                    it.printStackTrace()
                })
        )
    }

}