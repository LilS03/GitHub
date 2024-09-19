package com.example.github.domain.model

data class User(
    val userName: String,
    val avatarUrl: String,
    val id: Int,
    val fullName: String,
    val location: String,
    val followers: Int,
    val following: Int,
    val bio: String,
    val publicRepo : Int,
    val publicGists : Int,
    val updatedAt: String
)
