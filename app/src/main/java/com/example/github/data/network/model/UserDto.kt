package com.example.github.data.network.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "full_user_list")
data class UserDto(
    @SerializedName("login")
    @Expose
    val login: String,
    @SerializedName("id")
    @Expose
    val id: Int,
    @SerializedName("node_id")
    @Expose
    val node_id: String,
    @PrimaryKey
    @SerializedName("username")
    @Expose
    val userName: String,
    @SerializedName("avatar_url")
    @Expose
    val avatarUrl: String,
    @SerializedName("gravatar_id")
    @Expose
    val gravatar_id: String,
    @SerializedName("url")
    @Expose
    val url: String,
    @SerializedName("html_url")
    @Expose
    val html_url: String,
    @SerializedName("name")
    @Expose
    val fullName: String,
    @SerializedName("location")
    @Expose
    val location: String,
    @SerializedName("followers_url")
    @Expose
    val followers_url: String,
    @SerializedName("followers")
    @Expose
    val followers: Int,
    @SerializedName("following_url")
    @Expose
    val following_url: String,
    @SerializedName("following")
    @Expose
    val following: Int,
    @SerializedName("bio")
    @Expose
    val bio: String,
    @SerializedName("public_repos")
    @Expose
    val publicRepo : Int,
    @SerializedName("public_gists")
    @Expose
    val publicGists : Int,
    @SerializedName("updated_at")
    @Expose
    val updatedAt: String,
    @SerializedName("gists_url")
    @Expose
    val gists_url: String,
    @SerializedName("starred_url")
    @Expose
    val starred_url: String,
    @SerializedName("subscriptions_url")
    @Expose
    val subscriptions_url: String,
    @SerializedName("organizations_url")
    @Expose
    val organizations_url: String,
    @SerializedName("repos_url")
    @Expose
    val repos_url: String,
    @SerializedName("events_url")
    @Expose
    val events_url: String,
    @SerializedName("received_events_url")
    @Expose
    val received_events_url: String,
    @SerializedName("type")
    @Expose
    val type: String,
    @SerializedName("site_admin")
    @Expose
    val site_admin: String,
    @SerializedName("company")
    @Expose
    val company: String,
    @SerializedName("blog")
    @Expose
    val blog: String,
    @SerializedName("email")
    @Expose
    val email: String?,
    @SerializedName("hireable")
    @Expose
    val hireable: String?,
    @SerializedName("twitter_username")
    @Expose
    val twitter_username: String,
    @SerializedName("created_at")
    @Expose
    val created_at: String
)