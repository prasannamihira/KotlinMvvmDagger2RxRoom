package com.cclk.kotlinfirstapp.injection.component

import com.cclk.kotlinfirstapp.injection.model.NetworkModule
import com.cclk.kotlinfirstapp.ui.post.PostListViewModel
import com.cclk.kotlinfirstapp.ui.post.PostViewModel
import dagger.Component
import javax.inject.Singleton

/**
 * Component providing inject() methods for presenters.
 */
@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjector {
    /**
     * Injects required dependencies into the specified PostListViewModel.
     * @param postListViewModel PostListViewModel in which to inject the dependencies
     */
    fun inject(postListViewModel: PostListViewModel)

    /**
     * Injects required dependencies into the specified PostViewModel.
     * @param postViewModel PostViewModel in which to inject the dependencies
     */
    fun inject(postViewModel: PostViewModel)

    @Component.Builder
    interface Builder {
        fun build():ViewModelInjector

        fun networkModel(networkModel: NetworkModule): Builder
    }
}