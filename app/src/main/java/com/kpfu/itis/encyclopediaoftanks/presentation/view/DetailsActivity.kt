package com.kpfu.itis.encyclopediaoftanks.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.kpfu.itis.encyclopediaoftanks.R
import com.kpfu.itis.encyclopediaoftanks.data.network.ApiFactory
import com.kpfu.itis.encyclopediaoftanks.databinding.ActivityDetailsBinding
import com.kpfu.itis.encyclopediaoftanks.domain.TankInteractorImpl
import com.kpfu.itis.encyclopediaoftanks.presentation.viewmodel.ViewModelFactory
import com.kpfu.itis.encyclopediaoftanks.presentation.viewmodel.TankViewModel
import javax.inject.Inject

class DetailsActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val tankInteractor = TankInteractorImpl(ApiFactory.tankApi)
        viewModelFactory =
            ViewModelFactory(
                tankInteractor
            )
        val viewModel = getViewModel()
        viewModel.getTankById(intent.extras?.getInt("id") ?: 0).observe(this, Observer {
            binding = DataBindingUtil.setContentView<ActivityDetailsBinding>(this, R.layout.activity_details)
            binding.tankModel = it
        })
    }

    private fun getViewModel() = ViewModelProvider(this, viewModelFactory).get(TankViewModel::class.java)
}
