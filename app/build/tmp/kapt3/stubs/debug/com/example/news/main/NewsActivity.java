package com.example.news.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 12\u00020\u00012\u00020\u00022\u00020\u0003:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J \u0010$\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!2\u0006\u0010%\u001a\u00020\u0006H\u0002J\u0018\u0010&\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\'\u001a\u00020\u001fH\u0016J\u0012\u0010(\u001a\u00020\u001f2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\u0018\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020#H\u0016J\b\u0010.\u001a\u00020\u001fH\u0016J\u001c\u0010/\u001a\u00020\u001f2\b\u00100\u001a\u0004\u0018\u00010#2\b\u0010-\u001a\u0004\u0018\u00010#H\u0002R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R+\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R+\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001b\u0010\t\"\u0004\b\u001c\u0010\u000b\u00a8\u00062"}, d2 = {"Lcom/example/news/main/NewsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/news/main/RepoAdapter$OnItemClicked;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "()V", "<set-?>", "", "currentItem", "getCurrentItem", "()I", "setCurrentItem", "(I)V", "currentItem$delegate", "Lkotlin/properties/ReadWriteProperty;", "isScrolling", "", "repoAdapter", "Lcom/example/news/main/RepoAdapter;", "repoViewModel", "Lcom/example/news/main/RepoViewModel;", "scrollOutItem", "getScrollOutItem", "setScrollOutItem", "scrollOutItem$delegate", "swipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "totalItem", "getTotalItem", "setTotalItem", "totalItem$delegate", "getLocalHeadlines", "", "context", "Landroid/content/Context;", "roomCountryCode", "", "getPapers", "page", "observeMyPapers", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClicked", "repoURL", "ownerURL", "onRefresh", "showDialog", "desc", "Companion", "app_debug"})
public final class NewsActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.news.main.RepoAdapter.OnItemClicked, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener {
    private com.example.news.main.RepoAdapter repoAdapter;
    private com.example.news.main.RepoViewModel repoViewModel;
    private boolean isScrolling = false;
    private final kotlin.properties.ReadWriteProperty currentItem$delegate = null;
    private final kotlin.properties.ReadWriteProperty totalItem$delegate = null;
    private final kotlin.properties.ReadWriteProperty scrollOutItem$delegate = null;
    private androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout;
    @org.jetbrains.annotations.NotNull()
    public static android.app.AlertDialog loadDialogue;
    public static final com.example.news.main.NewsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onItemClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String repoURL, @org.jetbrains.annotations.NotNull()
    java.lang.String ownerURL) {
    }
    
    private final int getCurrentItem() {
        return 0;
    }
    
    private final void setCurrentItem(int p0) {
    }
    
    private final int getTotalItem() {
        return 0;
    }
    
    private final void setTotalItem(int p0) {
    }
    
    private final int getScrollOutItem() {
        return 0;
    }
    
    private final void setScrollOutItem(int p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getPapers(com.example.news.main.RepoViewModel repoViewModel, android.content.Context context, int page) {
    }
    
    private final void observeMyPapers(com.example.news.main.RepoViewModel repoViewModel, com.example.news.main.RepoAdapter repoAdapter) {
    }
    
    private final void getLocalHeadlines(android.content.Context context, com.example.news.main.RepoViewModel repoViewModel, java.lang.String roomCountryCode) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void showDialog(java.lang.String desc, java.lang.String ownerURL) {
    }
    
    @java.lang.Override()
    public void onRefresh() {
    }
    
    public NewsActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/news/main/NewsActivity$Companion;", "", "()V", "loadDialogue", "Landroid/app/AlertDialog;", "getLoadDialogue", "()Landroid/app/AlertDialog;", "setLoadDialogue", "(Landroid/app/AlertDialog;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.AlertDialog getLoadDialogue() {
            return null;
        }
        
        public final void setLoadDialogue(@org.jetbrains.annotations.NotNull()
        android.app.AlertDialog p0) {
        }
        
        private Companion() {
            super();
        }
    }
}