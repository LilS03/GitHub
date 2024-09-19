package com.example.github.data.network

import com.example.github.data.model.UserDto
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<UserDto>

    @GET("users/{username}")
    suspend fun getUser(@Path("username") username: String): UserDto
}
