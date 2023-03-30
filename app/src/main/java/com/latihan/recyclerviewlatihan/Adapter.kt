package com.latihan.recyclerviewlatihan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val listNews: ArrayList<NewsData>): RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val judul = itemView.findViewById<TextView>(R.id.judul)
        val tgl = itemView.findViewById<TextView>(R.id.tgl)
        val kategori = itemView.findViewById<TextView>(R.id.kategori)
        val img = itemView.findViewById<ImageView>(R.id.img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_berita, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.judul.text = listNews[position].judul
        holder.tgl.text = listNews[position].tgl
        holder.kategori.text = listNews[position].kategori
        holder.img.setImageResource(listNews[position].img)
    }

    override fun getItemCount(): Int {
        return listNews.size
    }
}