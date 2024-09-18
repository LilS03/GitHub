package com.example.github.data.mapper

import com.example.github.data.database.UserDbModel
import com.example.github.data.network.model.UserDto
import com.example.github.data.network.model.UserJsonContainerDto
import com.example.github.data.network.model.UserNamesListDto
import com.example.github.domain.User
import com.google.gson.Gson

class UserMapper {
    fun mapDtoToDbModel(dto: UserDto): UserDbModel{
        return UserDbModel(
            userName = dto.userName,
            avatarUrl = dto.avatarUrl,
            id = dto.id,
            fullName = dto.fullName,
            location = dto.location,
            followers = dto.followers,
            following = dto.following,
            bio = dto.bio,
            publicRepo = dto.publicRepo,
            publicGists = dto.publicGists,
            updatedAt = dto.updatedAt,
        )
    }
    fun mapJsonContainerToListUser(jsonContainer: UserJsonContainerDto): List<UserDto>{
        val result = mutableListOf<UserDto>()
        val jsonObject = jsonContainer.json ?: return result
        val keySet = jsonObject.keySet()
        for (key in keySet) {
            val currencyJson = jsonObject.getAsJsonObject(key)
            val currencyKeySet = currencyJson.keySet()
            for (currencyKey in currencyKeySet) {
                val priceInfo = Gson().fromJson(
                    currencyJson.getAsJsonObject(currencyKey),
                    UserDto::class.java
                )
                result.add(priceInfo)
            }
        }
        return result
    }
    fun mapNamesListToString(namesListDto: UserNamesListDto): String{
        return namesListDto.names?.map {
            it.userName?.name
        }?.joinToString(",") ?: ""
    }
    fun mapDbModelToEntity(dbModel: UserDbModel): User{
        return User(
            userName = dbModel.userName,
            avatarUrl = dbModel.avatarUrl,
            id = dbModel.id,
            fullName = dbModel.fullName,
            location = dbModel.location,
            followers = dbModel.followers,
            following = dbModel.following,
            bio = dbModel.bio,
            publicRepo = dbModel.publicRepo,
            publicGists = dbModel.publicGists,
            updatedAt = dbModel.updatedAt,
        )
    }
    companion object{
        const val BASE_IMAGE_URL = "https://avatars.githubusercontent.com/u/1?v=4"
    }
}