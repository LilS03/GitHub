package com.example.github.data.repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.github.data.database.AppDatabase
import com.example.github.data.mapper.UserMapper
import com.example.github.data.network.ApiFactory
import com.example.github.domain.User
import com.example.github.domain.UserRepository
import kotlinx.coroutines.delay

class UserRepositoryImpl(
    private val application: Application
): UserRepository {
    private val userDao = AppDatabase.getInstance(application).userDao()
    private val mapper = UserMapper()
    private val apiService = ApiFactory.apiService

    override fun getUserList(): LiveData<List<User>> {
        return Transformations.map(userDao.getUserList()){
            it.map {
                mapper.mapDbModelToEntity(it)
            }
        }
    }

    override fun getUser(userName: String): LiveData<User> {
        return Transformations.map(userDao.getUser(userName)){
            mapper.mapDbModelToEntity(it)
        }
    }

    override suspend fun loadData() {
        while(true){
            try {
                val topCoins = apiService.getUsers()
                val name = mapper.mapNamesListToString(topCoins)
                val jsonContainer = apiService.getUserInfo(name)
                val userDtoList = mapper.mapJsonContainerToListUser(jsonContainer)
                val dbModelList = userDtoList.map {
                    mapper.mapDtoToDbModel(it)
                }
                userDao.insertUserList(dbModelList)
            } catch (_: Exception) {
            }
            delay(10000)
        }
    }
}