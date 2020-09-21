package com.example.news.roomdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [RoomModel::class], version = 2)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getMyDao(): AppDao

    companion object {

        private var Instance: AppDatabase? = null

        fun getMyInstance(context: Context): AppDatabase {

            if (Instance == null)
                Instance =
                    Room.databaseBuilder(context, AppDatabase::class.java, "headlines_db").build()

            return Instance!!
        }
    }
}