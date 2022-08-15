package com.example.domain.result

enum class Status {
    SUCCESS,
    FAILURE,
    LOADING
}

data class Result<T>(
    val status: Status,
    val value: T?,
    val errorMessage: Throwable?
)
