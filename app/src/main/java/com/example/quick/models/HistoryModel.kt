package com.example.quick.models

data class HistoryModel(
    val id: String,
    val date: Long,
    val pacientId: String,
    val excersiseList: List<ExcerciseModel>,
)
