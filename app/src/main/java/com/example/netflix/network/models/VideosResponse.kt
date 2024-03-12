package com.example.netflix.network.models

import com.example.netflix.models.Video

data class VideosResponse(
    val results: List<Video>,
)