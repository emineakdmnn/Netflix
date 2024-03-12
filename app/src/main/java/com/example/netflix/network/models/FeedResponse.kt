package com.example.netflix.network.models

import com.example.netflix.models.FeedItem
import com.squareup.moshi.Json


data class FeedResponse(
    @Json(name = "page") val page: Int,
    @Json(name = "results") val results: List<FeedItem>,
    @Json(name = "total_pages") val totalPages: Int,
    @Json(name = "total_results") val totalResults: Int,
)
