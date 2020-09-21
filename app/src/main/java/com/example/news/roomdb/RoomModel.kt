package com.example.news.roomdb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.example.news.main.Repo

@Entity(tableName = "paperss_table")
@TypeConverters(PapersConverter::class)
data class RoomModel(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") var id: Int? = null,
    @ColumnInfo(name = "roomCountryCode") var roomCountryCode: String,
    @TypeConverters
    @ColumnInfo(name = "roomHeadlinesList") var roomHeadlinesList: List<Repo>?
)