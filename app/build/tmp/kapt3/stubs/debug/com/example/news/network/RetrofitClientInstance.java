package com.example.news.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/news/network/RetrofitClientInstance;", "", "()V", "BASE_URL", "", "retrofitClientService", "Lcom/example/news/network/RetrofitClientService;", "getRetrofitClientInstance", "app_debug"})
public final class RetrofitClientInstance {
    private static final java.lang.String BASE_URL = "https://api.github.com/users/square/";
    private static com.example.news.network.RetrofitClientService retrofitClientService;
    public static final com.example.news.network.RetrofitClientInstance INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.news.network.RetrofitClientService getRetrofitClientInstance() {
        return null;
    }
    
    private RetrofitClientInstance() {
        super();
    }
}