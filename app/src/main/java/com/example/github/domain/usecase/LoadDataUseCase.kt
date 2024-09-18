package com.example.github.domain.usecase

import com.example.github.domain.UserRepository

class LoadDataUseCase(
    private val repository: UserRepository
) {
    suspend operator fun invoke() = repository.loadData()
}