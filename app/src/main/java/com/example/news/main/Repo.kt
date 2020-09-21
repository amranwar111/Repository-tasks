package com.example.news.main

import com.google.gson.annotations.SerializedName


data class Repo(
    @SerializedName("name") val repoName: String,
    @SerializedName("owner") val repoOwner: RepoOwner,
    @SerializedName("description") val repoDesc: String,
    @SerializedName("html_url") val repoURL: String,
    @SerializedName("fork") val repoFork: Boolean
)

//@Entity(tableName = "repos_table")
//data class Repo(
//    @PrimaryKey(autoGenerate = true)
//    @ColumnInfo(name = "id") val id: Int,
//    @ColumnInfo(name = "name")
//    @SerializedName("name") val repoName: String,
//    @ColumnInfo(name = "owner")
//    @SerializedName("owner") val repoOwner: RepoOwner,
//    @ColumnInfo(name = "description")
//    @SerializedName("description") val repoDesc: String,
//    @ColumnInfo(name = "html_url")
//    @SerializedName("html_url") val repoURL: String,
//    @ColumnInfo(name = "fork")
//    @SerializedName("fork") val repoFork: Boolean
//)