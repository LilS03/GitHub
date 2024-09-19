package com.example.github.domain.usecase

import com.example.github.core.dispatchers.DispatchersProvider
import com.example.github.domain.model.User
import com.example.github.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

interface GetUserListUseCase {
    operator fun invoke(): Flow<List<User>>
}

private class GetUserListUseCaseImpl(
    private val repository: UserRepository,
    private val dispatchers: DispatchersProvider,
) : GetUserListUseCase {
    override operator fun invoke() = repository.getUsers().flowOn(dispatchers.io)
}