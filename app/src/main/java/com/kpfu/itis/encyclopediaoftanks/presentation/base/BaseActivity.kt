package com.kpfu.itis.encyclopediaoftanks.presentation.base

import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

abstract class BaseActivity<T : BaseViewModel> : AppCompatActivity() {

    @Inject
    protected open lateinit var viewModel: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutResource())
        initViews()
        subscribe(viewModel)
    }

    abstract fun layoutResource(): Int

    abstract fun initViews()

    abstract fun subscribe(viewModel: T)
}