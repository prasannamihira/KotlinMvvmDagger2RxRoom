package com.cclk.kotlinfirstapp.base

import android.arch.lifecycle.ViewModel
import com.cclk.kotlinfirstapp.injection.component.ViewModelInjector
import com.cclk.kotlinfirstapp.injection.component.DaggerViewModelInjector
import com.cclk.kotlinfirstapp.injection.model.NetworkModule
import com.cclk.kotlinfirstapp.ui.post.PostListViewModel
import com.cclk.kotlinfirstapp.ui.post.PostViewModel

abstract class BaseViewModel:ViewModel() {

    private val injector:ViewModelInjector = DaggerViewModelInjector
            .builder()
            .networkModel(NetworkModule)
            .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when(this){
            is PostListViewModel -> injector.inject(this)
            is PostViewModel -> injector.inject(this)
        }
    }
}