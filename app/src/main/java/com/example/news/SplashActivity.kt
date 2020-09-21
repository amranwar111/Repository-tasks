package com.example.news

import android.app.job.JobInfo
import android.content.ComponentName
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.news.main.NewsActivity


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        val flexMillis = 59 * 60 * 1000.toLong() // wait 59 minutes before executing next job

        val componentName = ComponentName(this, Job::class.java)
        val info = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            JobInfo.Builder(1, componentName)
                .setRequiredNetworkType(JobInfo.NETWORK_TYPE_UNMETERED) // change this later to wifi
                .setPersisted(true)
                .setPeriodic(60 * 60 * 10000.toLong(), flexMillis)
                .build()
        } else {
            JobInfo.Builder(1, componentName)
                .setRequiredNetworkType(JobInfo.NETWORK_TYPE_UNMETERED) // change this later to wifi
                .setPersisted(true)
                .setPeriodic(60 * 60 * 10000.toLong())
                .build()
        }
        splashTime()
    }

    private fun splashTime() {

        Handler().postDelayed({
            kotlin.run {

                val mainIntent = Intent(this.applicationContext, NewsActivity::class.java)
                mainIntent.addFlags(FLAG_ACTIVITY_NEW_TASK)
                startActivity(mainIntent)
            }
        }, 3000)

        /*   Thread(Runnable {

               AppDatabase.getMyInstance(applicationContext).getMyDao().deleteAll()

           }).start()*/
    }

}