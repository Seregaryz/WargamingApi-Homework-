package com.kpfu.itis.encyclopediaoftanks.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kpfu.itis.encyclopediaoftanks.domain.TankInteractor

class ViewModelFactory(
    private var tankInteractor: TankInteractor
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
        when {
            modelClass.isAssignableFrom(ListViewModel::class.java) -> {
                ListViewModel(tankInteractor) as? T
                    ?: throw IllegalArgumentException("Unknown ViewModel class")
            }
            modelClass.isAssignableFrom(TankViewModel::class.java) -> {
                TankViewModel(tankInteractor) as? T
                    ?: throw IllegalArgumentException("Unknown ViewModel class")
            }
            else -> {
                throw IllegalArgumentException("Unknown ViewModel class")
            }
        }
}

