package com.example.myapplication.Adapter.ViewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Interface.ItemClickListener
import kotlinx.android.synthetic.main.source_news_layout.view.*


class LIstSourceViewHolder(itemView: View):RecyclerView.ViewHolder(itemView), View.OnClickListener{

    private lateinit var itemClickListener: ItemClickListener
    var source_title = itemView.source_news_name
    //view 설정

    init{
        itemView.setOnClickListener(this)
    }

    fun setItemClickListener(itemClickListener: ItemClickListener)
    {
        this.itemClickListener = itemClickListener
    }

    override fun onClick(v: View?) {
        itemClickListener.onClick(v!!, adapterPosition)
    }
}
