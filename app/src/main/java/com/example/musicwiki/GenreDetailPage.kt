package com.example.musicwiki

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout

class GenreDetailPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_genre_detail_page)
    }

    fun previousPage(view: View){
        val intent= Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun openArtistPage(view: View) {
        val intent=Intent(this, Artistdetailpage::class.java)
        startActivity(intent)
    }
}