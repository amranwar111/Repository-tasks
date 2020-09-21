package com.example.news.main

import android.content.Context
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP
import android.os.Bundle
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.news.CustomDialogFragment
import com.example.news.MainActivity
import com.example.news.R
import com.example.news.main.RepoAdapter.Companion.theRepos
import com.example.news.network.isInternetAvailable
import com.example.news.roomdb.AppDatabase
import dmax.dialog.SpotsDialog
import kotlinx.android.synthetic.main.activity_news.*
import kotlin.properties.Delegates

class NewsActivity : AppCompatActivity(), RepoAdapter.OnItemClicked,
    SwipeRefreshLayout.OnRefreshListener {

    override fun onItemClicked(repoURL: String, ownerURL: String) {
        showDialog(repoURL, ownerURL)
    }

    companion object {
        lateinit var loadDialogue: android.app.AlertDialog
    }

    private lateinit var repoAdapter: RepoAdapter
    private lateinit var repoViewModel: RepoViewModel
    private var isScrolling = false
    private var currentItem by Delegates.notNull<Int>()
    private var totalItem by Delegates.notNull<Int>()
    private var scrollOutItem by Delegates.notNull<Int>()
    private lateinit var swipeRefreshLayout: SwipeRefreshLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)



        swipeRefreshLayout = findViewById<SwipeRefreshLayout>(R.id.refreshedNews)
        swipeRefreshLayout.setOnRefreshListener(this)

        val searchTxtBox = findViewById<CheckBox>(R.id.searchTxtBox)
        searchTxtBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                val filteredRepos = ArrayList<Repo>()
                for (repo in theRepos) {
                    if (repo.repoFork) {
                        filteredRepos.add(repo)
                    }
                }
                headlinesRecyclerView.adapter = repoAdapter
                headlinesRecyclerView.layoutManager =
                    LinearLayoutManager(this, RecyclerView.VERTICAL, false)
            }
        }

        var pageNumber = 1

        val headlinesRecyclerView: RecyclerView = findViewById(R.id.headlinesRecyclerView)

        loadDialogue = SpotsDialog.Builder()
            .setContext(this)
            .setMessage("Loading")
            .build()
        repoViewModel = RepoViewModel()
        repoAdapter = RepoAdapter(this, this)

        loadDialogue.show()

        if (isInternetAvailable(this)) {

            getPapers(repoViewModel, this, 1)
            observeMyPapers(repoViewModel, repoAdapter)

            headlinesRecyclerView.adapter = repoAdapter
            headlinesRecyclerView.layoutManager =
                LinearLayoutManager(this, RecyclerView.VERTICAL, false)
            headlinesRecyclerView.hasFixedSize()

            headlinesRecyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {

                override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {

                    currentItem =
                        (recyclerView.layoutManager as LinearLayoutManager).childCount
                    totalItem =
                        (recyclerView.layoutManager as LinearLayoutManager).itemCount
                    scrollOutItem =
                        (recyclerView.layoutManager as LinearLayoutManager).findFirstVisibleItemPosition()

                    if (!isScrolling) {
                        if (scrollOutItem + currentItem >= totalItem) {
                            //End of list
                            loadDialogue.show()
                            getPapers(repoViewModel, this@NewsActivity, ++pageNumber)
                            isScrolling = true
                        }
                    }
                    super.onScrolled(recyclerView, dx, dy)
                }
            })
        } else {

            getLocalHeadlines(this, repoViewModel, "us")
            loadDialogue.dismiss()
        }
    }

    private fun getPapers(
        repoViewModel: RepoViewModel,
        context: Context,
        page: Int
    ) {

        repoViewModel.getMyHeadLines(context, page)
    }

    private fun observeMyPapers(repoViewModel: RepoViewModel, repoAdapter: RepoAdapter) {

        repoViewModel.getLiveData().observe(this, androidx.lifecycle.Observer {

            repoAdapter.addPapers(it)
            repoAdapter.notifyDataSetChanged()
            isScrolling = false
            loadDialogue.dismiss()
        })
    }

    private fun getLocalHeadlines(
        context: Context,
        repoViewModel: RepoViewModel,
        roomCountryCode: String?
    ) {

        roomCountryCode?.let { countryCode ->
            repoViewModel.getLocalHeadlines(context, countryCode).observe(this, Observer {

                if (it != null) {
                    repoAdapter.addPapers(it.roomHeadlinesList as ArrayList<Repo>)
                    headlinesRecyclerView.adapter = repoAdapter
                    headlinesRecyclerView.layoutManager =
                        LinearLayoutManager(this, RecyclerView.VERTICAL, false)
                    headlinesRecyclerView.hasFixedSize()
                }
            })
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        theRepos.clear()
        val intent = Intent(this.applicationContext, MainActivity::class.java)
        intent.addFlags(FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
    }

    private fun showDialog(desc: String?, ownerURL: String?) {

        val fm: FragmentManager = supportFragmentManager
        val editNameDialogFragment: CustomDialogFragment = CustomDialogFragment().newInstance(
            desc,
            ownerURL
        )
        editNameDialogFragment.show(fm, "description_dialog")
    }

    override fun onRefresh() {
        theRepos.clear()
        Thread {
            AppDatabase.getMyInstance(this).getMyDao().deleteAll()
        }.start()
        getPapers(repoViewModel, this@NewsActivity, 1)
        swipeRefreshLayout.isRefreshing = false
    }
}