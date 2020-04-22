package com.example.myapplication.Adapter.ViewHolder

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Interface.ItemClickListener
import com.example.myapplication.ListNews
import com.example.myapplication.Model.WebSite
import com.example.myapplication.R

class ListSourceAdapter (private  val context: Context, private val webSite: WebSite):RecyclerView.Adapter<LIstSourceViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LIstSourceViewHolder {
        val inflater = LayoutInflater.from(parent!!.context)
        val itemView = inflater.inflate(R.layout.source_news_layout, parent, false)
        return LIstSourceViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return webSite.sources!!.size
    }

    override fun onBindViewHolder(holder: LIstSourceViewHolder, position: Int) {
        holder!!.source_title.text = webSite.sources!![position].name
        // holder에 모델 source의 key가 name인 value 값을 넣어줌


        holder.setItemClickListener(object:ItemClickListener
        {
            override fun onClick(view: View, position: Int) {
                //List News activity when click on Source news
                val intent = Intent(context, ListNews::class.java)
                intent.putExtra("source", webSite.sources!![position].id)
                context.startActivity(intent)
            }
        })
    }

}