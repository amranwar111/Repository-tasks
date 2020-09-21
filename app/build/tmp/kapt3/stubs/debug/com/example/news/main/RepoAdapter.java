package com.example.news.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003\u001a\u001b\u001cB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\n\u001a\u00020\u000bJ\"\u0010\f\u001a\u00020\u000b2\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u000b2\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/news/main/RepoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/news/main/RepoAdapter$ViewHolder;", "listener", "Lcom/example/news/main/RepoAdapter$OnItemClicked;", "context", "Landroid/content/Context;", "(Lcom/example/news/main/RepoAdapter$OnItemClicked;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "addFilteredRepos", "", "addPapers", "repos", "Ljava/util/ArrayList;", "Lcom/example/news/main/Repo;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "OnItemClicked", "ViewHolder", "app_debug"})
public final class RepoAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.news.main.RepoAdapter.ViewHolder> {
    private final com.example.news.main.RepoAdapter.OnItemClicked listener = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.example.news.main.Repo> theRepos;
    public static final com.example.news.main.RepoAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.news.main.RepoAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void addPapers(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.example.news.main.Repo> repos) {
    }
    
    public final void addFilteredRepos() {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.news.main.RepoAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public RepoAdapter(@org.jetbrains.annotations.NotNull()
    com.example.news.main.RepoAdapter.OnItemClicked listener, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/news/main/RepoAdapter$OnItemClicked;", "", "onItemClicked", "", "repoURL", "", "ownerURL", "app_debug"})
    public static abstract interface OnItemClicked {
        
        public abstract void onItemClicked(@org.jetbrains.annotations.NotNull()
        java.lang.String repoURL, @org.jetbrains.annotations.NotNull()
        java.lang.String ownerURL);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\f\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lcom/example/news/main/RepoAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listItemView", "Landroid/view/View;", "(Lcom/example/news/main/RepoAdapter;Landroid/view/View;)V", "paperItemBackground", "Landroidx/cardview/widget/CardView;", "getPaperItemBackground", "()Landroidx/cardview/widget/CardView;", "repoDesc", "Landroid/widget/TextView;", "getRepoDesc", "()Landroid/widget/TextView;", "repoName", "getRepoName", "setRepoName", "(Landroid/widget/TextView;)V", "userName", "getUserName", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView repoName;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView userName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView repoDesc = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.cardview.widget.CardView paperItemBackground = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getRepoName() {
            return null;
        }
        
        public final void setRepoName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getUserName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getRepoDesc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getPaperItemBackground() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View listItemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/example/news/main/RepoAdapter$Companion;", "", "()V", "theRepos", "Ljava/util/ArrayList;", "Lcom/example/news/main/Repo;", "getTheRepos", "()Ljava/util/ArrayList;", "setTheRepos", "(Ljava/util/ArrayList;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.example.news.main.Repo> getTheRepos() {
            return null;
        }
        
        public final void setTheRepos(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.example.news.main.Repo> p0) {
        }
        
        private Companion() {
            super();
        }
    }
}