package com.example.github.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao {
    @Query("SELECT * FROM full_user_list ORDER BY id DESC")
    fun getUserList(): LiveData<List<UserDbModel>>

    @Query("SELECT * FROM full_user_list WHERE username == :username LIMIT 1")
    fun getUser(username: String): LiveData<UserDbModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUserList(userList: List<UserDbModel>)
}