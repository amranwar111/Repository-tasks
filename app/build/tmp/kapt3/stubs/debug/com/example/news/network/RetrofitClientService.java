package com.example.news.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/news/network/RetrofitClientService;", "", "getAllRepos", "Lio/reactivex/rxjava3/core/Observable;", "", "Lcom/example/news/main/Repo;", "token", "", "pageSize", "", "page", "app_debug"})
public abstract interface RetrofitClientService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "repos")
    public abstract io.reactivex.rxjava3.core.Observable<java.util.List<com.example.news.main.Repo>> getAllRepos(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "access_token")
    java.lang.String token, @retrofit2.http.Query(value = "per_page")
    int pageSize, @retrofit2.http.Query(value = "page")
    int page);
}