package com.example.dailybreakingnews.models

import com.example.dailybreakingnews.models.Article

data class NewsResponse(
        val articles: MutableList<Article>,
        val status: String,
        val totalResults: Int
)