package com.example.dailybreakingnews

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)