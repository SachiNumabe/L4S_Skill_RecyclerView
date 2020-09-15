package com.example.l4s_skill_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val courseData: List<CourseData> =  listOf(
        CourseData(R.drawable.ic_launcher_background,"Androidアプリ開発コース","アプリを作るよ！"),
        CourseData(R.drawable.ic_launcher_background,"Androidアプリ開発コース","アプリを作るよ！"),
        CourseData(R.drawable.ic_launcher_background,"Androidアプリ開発コース","アプリを作るよ！"),
        CourseData(R.drawable.ic_launcher_background,"Androidアプリ開発コース","アプリを作るよ！"),
        CourseData(R.drawable.ic_launcher_background,"Androidアプリ開発コース","アプリを作るよ！"),
        CourseData(R.drawable.ic_launcher_background,"Androidアプリ開発コース","アプリを作るよ！"),
        CourseData(R.drawable.ic_launcher_background,"Androidアプリ開発コース","アプリを作るよ！"),
        CourseData(R.drawable.ic_launcher_background,"Androidアプリ開発コース","アプリを作るよ！"),
        CourseData(R.drawable.ic_launcher_background,"Androidアプリ開発コース","アプリを作るよ！"),
        CourseData(R.drawable.ic_launcher_background,"Androidアプリ開発コース","アプリを作るよ！"),
        CourseData(R.drawable.ic_launcher_background,"Androidアプリ開発コース","アプリを作るよ！"),
        CourseData(R.drawable.ic_launcher_background,"Androidアプリ開発コース","アプリを作るよ！"),
        CourseData(R.drawable.ic_launcher_background,"Androidアプリ開発コース","アプリを作るよ！"),
        CourseData(R.drawable.ic_launcher_background,"Androidアプリ開発コース","アプリを作るよ！"),
        CourseData(R.drawable.ic_launcher_background,"Androidアプリ開発コース","アプリを作るよ！"),
        CourseData(R.drawable.ic_launcher_background,"Androidアプリ開発コース","アプリを作るよ！"),
        CourseData(R.drawable.ic_launcher_background,"Androidアプリ開発コース","アプリを作るよ！"),
        CourseData(R.drawable.ic_launcher_background,"Androidアプリ開発コース","アプリを作るよ！")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = RecyclerViewAdapter(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        adapter.addAll(courseData)
    }
}