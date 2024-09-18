package com.example.github.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UserNameDto(
    @SerializedName("Name")
    @Expose
    val name: String? = null
)