package com.example.github.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UserNameContainerDto(
    @SerializedName("username")
    @Expose
    val userName: UserNameDto? = null
)
