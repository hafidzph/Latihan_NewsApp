package com.latihan.recyclerviewlatihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.latihan.recyclerviewlatihan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listNews = arrayListOf(NewsData("Kebakaran Rumah", "20-03-2022", "Kebakaran", R.drawable.img),
            NewsData("Korupsi Terus", "09-02-2021", "Korupsi", R.drawable.img_1),
            NewsData("Korupsi Lagi", "10-03-2020", "Korupsi", R.drawable.img_2),
            NewsData("Korupsi Lagi Hehehe", "10-12-2021", "Korupsi", R.drawable.img_3),
            NewsData("Korupsi Lampung", "28-11-2021", "Korupsi", R.drawable.img_4),
            NewsData("Korupsi Bansos", "15-07-2020", "Korupsi", R.drawable.img_5),
            NewsData("Ibu Tiri Siksa Anak", "24-12-2022", "Kekerasan", R.drawable.img_6),
            NewsData("Demo Kemerdekaan Kekerasan", "29-10-2022", "Demo", R.drawable.img_7),
            NewsData("Kekerasan Anak", "05-03-2020", "Kekerasan", R.drawable.img_8),
            NewsData("Remaja Dibacok", "29-12-2020", "Kekerasan", R.drawable.img_9)
        )

        val adapter = Adapter(listNews)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        binding.rv.layoutManager = layoutManager
        binding.rv.adapter = adapter
    }
}