package com.latihan.recyclerviewlatihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.latihan.recyclerviewlatihan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var viewModel : NewViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = Adapter(ArrayList())

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        binding.rv.layoutManager = layoutManager
        binding.rv.adapter = adapter

        viewModel = ViewModelProvider(this)[NewViewModel::class.java]
        viewModel.ldNews.observe(this) {
            adapter.addData(it as ArrayList<NewsData>)
        }
    }
}