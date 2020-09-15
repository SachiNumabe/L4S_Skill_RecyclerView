package com.example.l4s_skill_recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private val context:Context) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    //RecyclerViewに表示するリスト宣言
    val items:MutableList<CourseData> = mutableListOf()

    class ViewHolder(view:View): RecyclerView.ViewHolder(view){
        val charaImage:ImageView = view.findViewById(R.id.characterImageView)
        val charaNameText:TextView = view.findViewById(R.id.courseNameTextView)
        val charaDetailTextView:TextView = view.findViewById(R.id.descriptionTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_course_data_cell,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        //要素数を返す
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.charaImage.setImageResource(item.characterImageResource)
        holder.charaNameText.text = item.courseName
        holder.charaDetailTextView.text = item.description
    }

    //引数にとったListをAdapterに追加するメソッド
    fun addAll (items: List<CourseData>){
        this.items.addAll(items)
        notifyDataSetChanged()
    }
}