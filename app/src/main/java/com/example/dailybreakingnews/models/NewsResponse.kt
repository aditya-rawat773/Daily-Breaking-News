package com.example.dailybreakingnews.models

import com.example.dailybreakingnews.models.Article

data class NewsResponse(
        val articles: List<Article>,
        val status: String,
        val totalResults: Int
)