package com.example.github.data.model

import androidx.room.PrimaryKey
import com.example.github.domain.model.User
import com.google.gson.annotations.SerializedName

data class UserDto(
    @SerializedName("avatar_url")
    val avatarUrl: String?,
    @SerializedName("bio")
    val bio: String?,
    @SerializedName("followers")
    val followers: Int?,
    @SerializedName("following")
    val following: Int?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("location")
    val location: String?,
    @PrimaryKey
    @SerializedName("login")
    val userName: String?,
    @SerializedName("name")
    val fullName: String?,
    @SerializedName("public_gists")
    val publicGists: Int?,
    @SerializedName("public_repos")
    val publicRepo: Int?,
    @SerializedName("updated_at")
    val updatedAt: String?,
) {
    data class PlanDto(
        @SerializedName("collaborators")
        val collaborators: Int?,
        @SerializedName("name")
        val name: String?,
        @SerializedName("private_repos")
        val privateRepos: Int?,
        @SerializedName("space")
        val space: Int?
    )
    fun toDomain(): User =
        User(
            avatarUrl = avatarUrl.orEmpty(),
            bio = bio.orEmpty(),
            followers = followers ?: 0,
            following = following ?: 0,
            id = id ?: 0,
            location = location.orEmpty(),
            userName = userName.orEmpty(),
            fullName = fullName.orEmpty(),
            publicGists = publicGists ?: 0,
            publicRepo = publicRepo ?: 0,
            updatedAt = updatedAt.orEmpty()
        )
}
