package com.example.news;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0002\u00a8\u0006\f"}, d2 = {"Lcom/example/news/Job;", "Landroid/app/job/JobService;", "()V", "clearCache", "", "createNotificationChannel", "onStartJob", "", "params", "Landroid/app/job/JobParameters;", "onStopJob", "showNotification", "app_debug"})
public final class Job extends android.app.job.JobService {
    
    @java.lang.Override()
    public boolean onStartJob(@org.jetbrains.annotations.Nullable()
    android.app.job.JobParameters params) {
        return false;
    }
    
    private final void clearCache() {
    }
    
    private final void showNotification() {
    }
    
    private final void createNotificationChannel() {
    }
    
    @java.lang.Override()
    public boolean onStopJob(@org.jetbrains.annotations.Nullable()
    android.app.job.JobParameters params) {
        return false;
    }
    
    public Job() {
        super();
    }
}