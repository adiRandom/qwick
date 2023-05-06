package com.example.quick.models

data class ExcerciseModel(
    val id: String,
    val info: ExcerciseInfoModel,
    val reps: Int,
    val sets: Int,
    val hold: Int,
)
