package com.example.news

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.job.JobParameters
import android.app.job.JobService
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import com.example.news.roomdb.AppDatabase


class Job : JobService() {
    override fun onStartJob(params: JobParameters?): Boolean {
        Thread {
            //Do your database´s operations here
            clearCache()
        }.start()
        showNotification()

        return true
    }

    private fun clearCache() {
        AppDatabase.getMyInstance(this).getMyDao().deleteAll()
    }

    private fun showNotification() {
        val notificationChannelId: String = NotificationUtil.createNotificationChannel(this)

        val title = "Clear Cache"
        val msg = "Clear Cache"

        val bigTextStyle = NotificationCompat.BigTextStyle()
            .bigText(msg)
            .setBigContentTitle(title)

        val notifyPendingIntent = PendingIntent.getActivity(
            this,
            0,
            Intent(),
            PendingIntent.FLAG_CANCEL_CURRENT
        )

        //Build and issue the notification.

        // Notification Channel Id is ignored for Android pre O (26).

        //Build and issue the notification.

        // Notification Channel Id is ignored for Android pre O (26).
        val notificationCompatBuilder = NotificationCompat.Builder(
            this, notificationChannelId
        )

        val notification: Notification =
            notificationCompatBuilder // BIG_TEXT_STYLE sets title and content for API 16 (4.1 and after).
                .setStyle(bigTextStyle) // Title for API <16 (4.0 and below) devices.
                .setContentTitle(title) // Content for API <24 (7.0 and below) devices.
                .setContentText(msg)
                .setContentIntent(notifyPendingIntent)
                .setDefaults(NotificationCompat.FLAG_AUTO_CANCEL) // Set primary color (important for Wear 2.0 Notifications).
                .setCategory(Notification.CATEGORY_EVENT) // Sets priority for 25 and below. For 26 and above, 'priority' is deprecated for
                .setSmallIcon(com.example.news.R.drawable.ic_launcher_background)
                // 'importance' which is set in the NotificationChannel. The integers representing
                // 'priority' are different from 'importance', so make sure you don't mix them.
                .setPriority(NotificationCompat.PRIORITY_MAX) // Sets lock-screen visibility for 25 and below. For 26 and above, lock screen
                // visibility is set in the NotificationChannel.
                .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
                .setAutoCancel(true) // Adds additional actions specified above.
                .build()
        val mNotificationManagerCompat =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        mNotificationManagerCompat.notify(254, notification)
    }

    private fun createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "Github"
            val descriptionText = "Github"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel("CHANNEL_ID", name, importance).apply {
                description = descriptionText
            }
            // Register the channel with the system
            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }


    override fun onStopJob(params: JobParameters?): Boolean {
        return true
    }


}