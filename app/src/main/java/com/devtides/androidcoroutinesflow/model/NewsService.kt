package com.devtides.androidcoroutinesflow.model

import com.devtides.androidcoroutinesretrofit.model.NewsArticle
import retrofit2.http.GET

interface NewsService {
    @GET("news.json")
    suspend fun getNewsArticles(): List<NewsArticle>
}