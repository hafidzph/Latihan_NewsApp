package com.latihan.recyclerviewlatihan

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.latihan.recyclerviewlatihan.databinding.ListBeritaBinding

class Adapter(val listNews: ArrayList<NewsData>): RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(val binding: ListBeritaBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(itemNews: NewsData){
            binding.newsData = itemNews
            binding.item.setOnClickListener {
                val intent = Intent(binding.root.context, DetailNews::class.java)
                intent.putExtra("NEWS_DATA", itemNews)
                binding.root.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(ListBeritaBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(listNews[position])

    override fun getItemCount(): Int = listNews.size

    fun addData(list: ArrayList<NewsData>){
        this.listNews.addAll(list)
    }

}