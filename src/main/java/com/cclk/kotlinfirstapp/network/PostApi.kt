package com.cclk.kotlinfirstapp.network

import io.reactivex.Observable
import com.cclk.kotlinfirstapp.model.Post
import retrofit2.http.GET

/**
 * The interface which provides methods to get result of webservices
 */
interface PostApi {

    /**
     * Get the list of posts from the API
     */
    @GET("/posts")
    fun getPosts(): Observable<List<Post>>

}