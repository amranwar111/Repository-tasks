package com.example.news.main

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.news.network.RetrofitClientInstance
import com.example.news.roomdb.AppDatabase
import com.example.news.roomdb.RoomModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers

class RepoViewModel : ViewModel() {

    private val roomModelList: ArrayList<RoomModel> = ArrayList()
    private var paperLiveData = MutableLiveData<ArrayList<Repo>>()
    private val compositeDisposable = CompositeDisposable()
    private lateinit var disposable: Disposable

    private val TOKEN = "cc548a884b68debf7a372ec278ed13cf4a1d9bc0"
    private val PAGE_SIZE = 10
    fun getMyHeadLines(context: Context, page: Int) {

        disposable = RetrofitClientInstance.getRetrofitClientInstance()
            .getAllRepos(TOKEN, PAGE_SIZE, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                paperLiveData.value = it as ArrayList<Repo>?

                val roomModel =
                    RoomModel(roomCountryCode = "us", roomHeadlinesList = paperLiveData.value)

                addLocalHeadlines(context, roomModel)

//                Thread(Runnable {
//                    if (page < 2) {
//                        countryCode?.let { it1 -> deletePreviousVersionRoom(context, it1) }
//                    }
//                }).start()

//                val roomObject: RoomModel? = countryCode?.let { it1 ->
//                        RoomModel(
//                            roomCountryCode = it1,
//                            roomHeadlinesList = it.papers
//                        )
//                    }

//                if (it.status == "ok" && thePapers.size < it.totalResults) {
//                    paperLiveData.value = it.papers
//
//                    val roomObject: RoomModel? = countryCode?.let { it1 ->
//                        RoomModel(
//                            roomCountryCode = it1,
//                            roomHeadlinesList = it.papers.take(5)
//                        )
//                    }
//
//                    if (page < 2) {
//                        roomObject?.let { it1 -> addLocalHeadlines(context, it1) }
//                    }
//
//                    compositeDisposable.add(disposable)
//
//                } else if (it.status == "ok" && thePapers.size == it.totalResults) {
//                    loadDialogue.dismiss()
//                    Toast.makeText(context, "Articles are Done", Toast.LENGTH_SHORT).show()
//                } else {
//                    loadDialogue.dismiss()
//                    Toast.makeText(context, "Status is error", Toast.LENGTH_SHORT).show()
//                }
            }
    }

    fun getLiveData(): LiveData<ArrayList<Repo>> = paperLiveData

    fun getLocalHeadlines(context: Context, roomCountryCode: String): LiveData<RoomModel> {

        return AppDatabase.getMyInstance(context).getMyDao().getHeadlines(roomCountryCode)
    }

    private fun deletePreviousVersionRoom(context: Context, roomCountryCode: String) {

        return AppDatabase.getMyInstance(context).getMyDao().deleteRoomHeadlines(roomCountryCode)
    }

    private fun addLocalHeadlines(context: Context, papers: RoomModel) {

        val myTask = ExampleThread(context, papers)
        myTask.start()
    }

    class ExampleThread(private val context: Context, private val papers: RoomModel) : Thread() {

        override fun run() {
            super.run()
            AppDatabase.getMyInstance(context).getMyDao().addHeadlines(papers)
        }
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }
}