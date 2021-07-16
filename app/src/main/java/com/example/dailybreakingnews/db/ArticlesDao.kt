package com.example.dailybreakingnews.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.dailybreakingnews.models.Article


@Dao
interface ArticlesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Article):Long

    @Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)
}