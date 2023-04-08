@file:Suppress("DEPRECATED_ANNOTATION")

package com.latihan.recyclerviewlatihan

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class NewsData(val judul: String, val tgl: String, val penulis: String, val img: Int, val content: String) : Parcelable