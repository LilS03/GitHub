package com.example.github.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "full_user_list")
data class UserDbModel(
    @PrimaryKey
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