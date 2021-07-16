package com.example.dailybreakingnews.repository

import com.example.dailybreakingnews.api.RetrofitInstance
import com.example.dailybreakingnews.db.ArticleDatabase

class NewsRepository(
        val db : ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode:String , pageNumber:Int)=
            RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)
}