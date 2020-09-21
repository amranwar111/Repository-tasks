package com.example.news.roomdb

import androidx.room.TypeConverter
import com.example.news.main.Repo
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class PapersConverter {

    private val gson = Gson()

    @TypeConverter
    fun toPapers(data: String?): List<Repo> {
        if (data == null) {
            return emptyList()
        }
        val listType = object : TypeToken<List<Repo>>() {}.type
        return gson.fromJson(data, listType)
    }

    @TypeConverter
    fun fromPapers(movies: List<Repo>): String {
        return gson.toJson(movies)
    }
}

class ResStringsConverter {

    val gson = Gson()

    @TypeConverter
    fun storedStringToStrings(data: String?): HashMap<String, String> {
        if (data == null) {
            return HashMap()
        }
        val listType = object : TypeToken<HashMap<String, String>>() {}.type
        return gson.fromJson(data, listType)
    }

    @TypeConverter
    fun stringsToStoredString(strings: HashMap<String, String>): String {
        return gson.toJson(strings)
    }
}