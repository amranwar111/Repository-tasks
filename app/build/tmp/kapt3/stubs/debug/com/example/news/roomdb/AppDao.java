package com.example.news.roomdb;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\b\u001a\u00020\tH\'\u00a8\u0006\f"}, d2 = {"Lcom/example/news/roomdb/AppDao;", "", "addHeadlines", "", "papers", "Lcom/example/news/roomdb/RoomModel;", "deleteAll", "deleteRoomHeadlines", "roomCountryCode", "", "getHeadlines", "Landroidx/lifecycle/LiveData;", "app_debug"})
public abstract interface AppDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void addHeadlines(@org.jetbrains.annotations.NotNull()
    com.example.news.roomdb.RoomModel papers);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM paperss_table WHERE roomCountryCode = :roomCountryCode")
    public abstract androidx.lifecycle.LiveData<com.example.news.roomdb.RoomModel> getHeadlines(@org.jetbrains.annotations.NotNull()
    java.lang.String roomCountryCode);
    
    @androidx.room.Query(value = "DELETE  FROM paperss_table WHERE roomCountryCode = :roomCountryCode")
    public abstract void deleteRoomHeadlines(@org.jetbrains.annotations.NotNull()
    java.lang.String roomCountryCode);
    
    @androidx.room.Query(value = "DELETE  FROM paperss_table")
    public abstract void deleteAll();
}