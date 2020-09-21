package com.example.news.network

import com.example.news.main.Repo
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitClientService {

    @GET("repos")
    fun getAllRepos(
        @Query("access_token") token: String,
        @Query("per_page") pageSize: Int,
        @Query("page") page: Int
    ): Observable<List<Repo>>
}