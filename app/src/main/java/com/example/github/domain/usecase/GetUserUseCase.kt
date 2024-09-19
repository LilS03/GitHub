package com.example.github.domain.usecase

import com.example.github.domain.repository.UserRepository

class GetUserUseCase(
    private val repository: UserRepository
) {
    operator fun invoke(userName: String) = repository.getUser(userName)
}