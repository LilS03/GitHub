package com.example.github.presentation

import androidx.lifecycle.ViewModel
import com.example.github.domain.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel
class UserViewModel: ViewModel() {
    private lateinit var repository: UserRepository
    fun getUsers() = repository.getUsers()
    fun getUser(userName: String) = repository.getUser(userName)
}