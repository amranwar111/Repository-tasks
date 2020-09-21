package com.example.news.roomdb

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface AppDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addHeadlines(papers: RoomModel)

    @Query("SELECT * FROM paperss_table WHERE roomCountryCode = :roomCountryCode")
    fun getHeadlines(roomCountryCode: String): LiveData<RoomModel>

    @Query("DELETE  FROM paperss_table WHERE roomCountryCode = :roomCountryCode")
    fun deleteRoomHeadlines(roomCountryCode: String)

    @Query("DELETE  FROM paperss_table")
    fun deleteAll()
}