package com.example.github.domain

import androidx.lifecycle.LiveData

interface UserRepository {
    fun getUserList(): LiveData<List<User>>
    fun getUser(userName: String): LiveData<User>
    suspend fun loadData()
}