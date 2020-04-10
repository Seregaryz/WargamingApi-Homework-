package com.kpfu.itis.encyclopediaoftanks.presentation.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.kpfu.itis.encyclopediaoftanks.R
import com.kpfu.itis.encyclopediaoftanks.data.network.ApiFactory
import com.kpfu.itis.encyclopediaoftanks.domain.TankInteractorImpl
import com.kpfu.itis.encyclopediaoftanks.presentation.viewmodel.ViewModelFactory
import com.kpfu.itis.encyclopediaoftanks.presentation.view.list.TankAdapter
import com.kpfu.itis.encyclopediaoftanks.presentation.viewmodel.ListViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var viewModelFactory: ViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        val tankInteractor = TankInteractorImpl(ApiFactory.tankApi)
        viewModelFactory =
            ViewModelFactory(
                tankInteractor
            )
        val viewModel = getViewModel()
        subscribe(viewModel)
    }

    private fun getViewModel() = ViewModelProvider(this, viewModelFactory).get(ListViewModel::class.java)

    private fun initViews() {
        rv_tank.layoutManager = LinearLayoutManager(this)
        rv_tank.setHasFixedSize(true)
    }

    private fun subscribe(viewModel: ListViewModel) {
        viewModel.tankLiveData.observe(this, Observer {
            if (rv_tank.adapter == null) {
                rv_tank.adapter = TankAdapter { tank -> navigateToDetails(tank) }
            }
            (rv_tank.adapter as TankAdapter).submitList(it)
        })
        viewModel.getTanks()
    }

    private fun navigateToDetails(id: Int){
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra("id", id)
        startActivity(intent)
    }

}
