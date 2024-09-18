package com.example.github.domain.usecase

import com.example.github.domain.UserRepository

class GetUserListUseCase(
    private val repository: UserRepository
) {
    operator fun invoke() = repository.getUserList()
}