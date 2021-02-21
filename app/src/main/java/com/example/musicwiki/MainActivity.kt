package com.example.musicwiki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView
import com.example.musicwiki.DataSource.Welcome
import com.google.gson.Gson
import okhttp3.*
import java.io.IOException

class MainActivity : AppCompatActivity() {

    private val client = OkHttpClient()

    private lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        run("http://ws.audioscrobbler.com/2.0/?method=tag.getTopTags&api_key=c9b90e5e44a8cca8888a5e62fe72b53f&format=json")
        }

    fun openGenrePage(view: View) {
        val intent=Intent(this,GenreDetailPage::class.java)
        startActivity(intent)
    }

    fun run(url: String) {
        val request = Request.Builder()
                .url(url)
                .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {}
            override fun onResponse(call: Call, response: Response) {
                val body = response?.body()?.string()

                var gson = Gson()
                var tagKotlinObj = gson?.fromJson(body, Welcome::class.java)

                println(tagKotlinObj)
            }
        })
    }



}