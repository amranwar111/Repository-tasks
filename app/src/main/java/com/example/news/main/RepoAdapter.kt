package com.example.news.main

import android.content.Context
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.news.R

class RepoAdapter(private val listener: OnItemClicked, val context: Context) :
    RecyclerView.Adapter<RepoAdapter.ViewHolder>() {

    companion object {
        var theRepos = ArrayList<Repo>()
    }

    interface OnItemClicked {
        fun onItemClicked(repoURL: String, ownerURL: String)
    }


    inner class ViewHolder(listItemView: View) : RecyclerView.ViewHolder(listItemView) {

        var repoName: TextView = listItemView.findViewById(R.id.repoName)
        val userName: TextView = listItemView.findViewById(R.id.userName)
        val repoDesc: TextView = listItemView.findViewById(R.id.repoDesc)
        val paperItemBackground: CardView = listItemView.findViewById(R.id.paperItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val thePaperView = inflater.inflate(R.layout.the_paper_item, parent, false)
        // Return a new holder instance
        return ViewHolder(thePaperView)
    }

    override fun getItemCount(): Int {
        return theRepos.size
    }

    fun addPapers(repos: ArrayList<Repo>?) {

        if (repos != null) {
            theRepos.addAll(repos)
            notifyDataSetChanged()
        }
        Log.i("Amr", "getItemCount: " + theRepos.size.toString())
    }

    fun addFilteredRepos() {

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val paper = theRepos[position]

        holder.repoName.text = paper.repoName
        holder.userName.text = paper.repoOwner?.userName
        holder.repoDesc.text = paper.repoDesc
        holder.itemView.setOnLongClickListener {
            paper.repoOwner?.userURL?.let { it1 -> listener.onItemClicked(paper.repoURL, it1) }
            return@setOnLongClickListener true
        }

        if (paper.repoFork) {
            holder.paperItemBackground.setBackgroundColor(Color.WHITE)
        } else {
            holder.paperItemBackground.setBackgroundColor(Color.GREEN)
        }
    }
}