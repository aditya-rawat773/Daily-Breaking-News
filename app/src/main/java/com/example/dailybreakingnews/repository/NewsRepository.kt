package com.example.dailybreakingnews.repository

import com.example.dailybreakingnews.api.RetrofitInstance
import com.example.dailybreakingnews.db.ArticleDatabase
import com.example.dailybreakingnews.models.Article

class NewsRepository(
        val db : ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode:String , pageNumber:Int)=
            RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)

    suspend fun searchNews(countryCode: String,pageNumber: Int) =
            RetrofitInstance.api.searchForNews(countryCode,pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}