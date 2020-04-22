package com.example.myapplication.Adapter.ViewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Interface.ItemClickListener
import kotlinx.android.synthetic.main.news_layout.view.*

class ListNewsViewHolder (itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener{

    private lateinit var itemClickLostener:ItemClickListener

    var article_title = itemView.article_title
    var article_time = itemView.article_time
    var article_image = itemView.article_image

    init {
        itemView.setOnClickListener(this)
    }

    fun setItemClickListener(itemClickListener: ItemClickListener){
        this.itemClickLostener = itemClickListener
    }

    override fun onClick(v: View) {
        itemClickLostener.onClick(v, adapterPosition)
    }
}