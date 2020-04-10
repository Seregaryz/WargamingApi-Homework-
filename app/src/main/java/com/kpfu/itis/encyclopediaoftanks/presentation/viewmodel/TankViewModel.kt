package com.kpfu.itis.encyclopediaoftanks.presentation.viewmodel

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.bumptech.glide.Glide

import com.kpfu.itis.encyclopediaoftanks.domain.TankInteractor
import com.kpfu.itis.encyclopediaoftanks.domain.model.TankModel
import com.kpfu.itis.encyclopediaoftanks.presentation.base.BaseViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.*

class TankViewModel(
    private val tankInteractor: TankInteractor
) : BaseViewModel() {

    private val tankMutableLiveData = MutableLiveData<TankModel>()
    val tankLiveData: LiveData<TankModel> = tankMutableLiveData

    fun getTankById(id: Int): MutableLiveData<TankModel> {
        disposables.add(
            tankInteractor.getTank(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    tankMutableLiveData.value = it
                }, {
                    it.printStackTrace()
                })
        )
        return tankMutableLiveData
    }

}

@BindingAdapter("android:src")
fun getImage(image: ImageView, source: String?) {
    Glide
        .with(image.context)
        .load(source)
        .into(image)
}
