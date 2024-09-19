package com.example.github.domain.repository

import com.example.github.domain.model.User
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    fun getUsers(): Flow<List<User>>
    fun getUser(userName: String): Flow<User>
}