package com.example.github.data.repository

import com.example.github.core.utils.emitFlow
import com.example.github.data.network.ApiService
import com.example.github.domain.model.User
import com.example.github.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val apiService: ApiService
): UserRepository {

    override fun getUsers(): Flow<List<User>> = emitFlow {
        apiService.getUsers().map { it.toDomain() }
    }

    override fun getUser(userName: String): Flow<User> = emitFlow {
        apiService.getUser(userName).toDomain()
    }
}