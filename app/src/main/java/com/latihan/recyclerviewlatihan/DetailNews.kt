package com.latihan.recyclerviewlatihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.latihan.recyclerviewlatihan.databinding.ActivityDetailNewsBinding

class DetailNews : AppCompatActivity() {
    lateinit var binding : ActivityDetailNewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val detailData = intent.getParcelableExtra<NewsData>("NEWS_DATA")
        binding.newsData = detailData
    }
}