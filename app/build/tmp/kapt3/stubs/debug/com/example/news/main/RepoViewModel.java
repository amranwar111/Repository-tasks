package com.example.news.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J\u001c\u0010\u0019\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u00110\u001aJ\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0006J\u0016\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0004J\b\u0010\u001e\u001a\u00020\u0013H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00100\rj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/example/news/main/RepoViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "PAGE_SIZE", "", "TOKEN", "", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "disposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "paperLiveData", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/example/news/main/Repo;", "roomModelList", "Lcom/example/news/roomdb/RoomModel;", "Lkotlin/collections/ArrayList;", "addLocalHeadlines", "", "context", "Landroid/content/Context;", "papers", "deletePreviousVersionRoom", "roomCountryCode", "getLiveData", "Landroidx/lifecycle/LiveData;", "getLocalHeadlines", "getMyHeadLines", "page", "onCleared", "ExampleThread", "app_debug"})
public final class RepoViewModel extends androidx.lifecycle.ViewModel {
    private final java.util.ArrayList<com.example.news.roomdb.RoomModel> roomModelList = null;
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.news.main.Repo>> paperLiveData;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable = null;
    private io.reactivex.rxjava3.disposables.Disposable disposable;
    private final java.lang.String TOKEN = "cc548a884b68debf7a372ec278ed13cf4a1d9bc0";
    private final int PAGE_SIZE = 10;
    
    public final void getMyHeadLines(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int page) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.example.news.main.Repo>> getLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.news.roomdb.RoomModel> getLocalHeadlines(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String roomCountryCode) {
        return null;
    }
    
    private final void deletePreviousVersionRoom(android.content.Context context, java.lang.String roomCountryCode) {
    }
    
    private final void addLocalHeadlines(android.content.Context context, com.example.news.roomdb.RoomModel papers) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public RepoViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/news/main/RepoViewModel$ExampleThread;", "Ljava/lang/Thread;", "context", "Landroid/content/Context;", "papers", "Lcom/example/news/roomdb/RoomModel;", "(Landroid/content/Context;Lcom/example/news/roomdb/RoomModel;)V", "run", "", "app_debug"})
    public static final class ExampleThread extends java.lang.Thread {
        private final android.content.Context context = null;
        private final com.example.news.roomdb.RoomModel papers = null;
        
        @java.lang.Override()
        public void run() {
        }
        
        public ExampleThread(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.example.news.roomdb.RoomModel papers) {
            super();
        }
    }
}