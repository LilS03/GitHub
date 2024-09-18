package com.example.github.data.network

import com.example.github.data.network.model.UserJsonContainerDto
import com.example.github.data.network.model.UserNamesListDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("users")
    suspend fun getUsers(
        @Query("avatar_url") avatarUrl: String = "",
        @Query("login") username: String = "",
        @Query("id") id: Int = 0,
    ): UserNamesListDto

    @GET("users/{username}")
    suspend fun getUserInfo(
        @Query("name") fullName: String = "",
        @Query("location") location: String = "",
        @Query("followers") followers: String = "",
        @Query("following") following: String = "",
        @Query("bio") bio: String = "",
    ): UserJsonContainerDto
}