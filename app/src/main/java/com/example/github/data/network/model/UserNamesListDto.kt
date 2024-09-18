package com.example.github.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UserNamesListDto(
    @SerializedName("Data")
    @Expose
    val names: List<UserNameContainerDto>? = null
)
