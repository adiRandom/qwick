package com.example.quick.models

data class PacientModel(
    val id: String,
    val name: String,
    val historyModelList: List<HistoryModel>,
    val excerciseModelList: List<ExcerciseModel>,
)
