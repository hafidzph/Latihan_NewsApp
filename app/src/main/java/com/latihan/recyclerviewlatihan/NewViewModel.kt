package com.latihan.recyclerviewlatihan

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.thedeanda.lorem.LoremIpsum

class NewViewModel: ViewModel() {
    val listNews = arrayListOf(NewsData("Kebakaran Rumah", "20-03-2022", "Udin Kurnia", R.drawable.img_1, LoremIpsum.getInstance().getWords(70)),
        NewsData("Korupsi Terus", "09-02-2021", "Tatang Maherman", R.drawable.img_8, LoremIpsum.getInstance().getWords(65)),
        NewsData("Korupsi Lagi", "10-03-2020", "Rojali Gonzales", R.drawable.img_2, LoremIpsum.getInstance().getWords(45)),
        NewsData("Korupsi Lagi Hehehe", "10-12-2021", "Yanto Ferguson", R.drawable.img_3, LoremIpsum.getInstance().getWords(55)),
        NewsData("Korupsi Lampung", "28-11-2021", "Yanti Angel", R.drawable.img_4, LoremIpsum.getInstance().getWords(71)),
        NewsData("Korupsi Bansos", "15-07-2020", "Supri Shelby", R.drawable.img_5, LoremIpsum.getInstance().getWords(56)),
        NewsData("Ibu Tiri Siksa Anak", "24-12-2022", "SupratMan", R.drawable.img_6, LoremIpsum.getInstance().getWords(52)),
        NewsData("Demo Kemerdekaan Kekerasan", "29-10-2022", "Lola Suratman", R.drawable.img_7, LoremIpsum.getInstance().getWords(63)),
        NewsData("Kekerasan Anak", "05-03-2020", "Ujang Rambo", R.drawable.img, LoremIpsum.getInstance().getWords(67)),
        NewsData("Remaja Dibacok", "29-12-2020", "Ferdy Mambo", R.drawable.img_9, LoremIpsum.getInstance().getWords(59))
    )

    private val mutableLD : MutableLiveData<List<NewsData>> = MutableLiveData(listNews)
    val ldNews : LiveData<List<NewsData>> = mutableLD

}