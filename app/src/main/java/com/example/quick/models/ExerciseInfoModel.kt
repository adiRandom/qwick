package com.example.quick.models

data class ExcerciseInfoModel(
    val id: String,
    val name: String,
    val description: String,
    val imageUrl: String?,
    val videoUrl: String?,
    val prepList: List<PrepModel>,
    /**
     * Minutes
     */
    val duration: Int,
    val scope: String
)
