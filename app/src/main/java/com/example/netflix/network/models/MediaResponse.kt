package com.example.netflix.network.models

import com.example.netflix.models.Media
import com.squareup.moshi.Json

data class MediaResponse(
    @Json(name = "page") val page: Int,
    @Json(name = "results") val results: List<Media>,
    @Json(name = "total_pages") val totalPages: Int,
    @Json(name = "total_results") val totalResults: Int
)