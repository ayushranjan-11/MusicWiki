package com.example.musicwiki

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.musicwiki.adapter.MainRecyclerAdapter
import com.example.musicwiki.recyclerView.AllCategory
import com.example.musicwiki.recyclerView.CategoryItem

class Artistdetailpage : AppCompatActivity() {

    private var mainCategoryRecycler:RecyclerView?= null
    private var mainRecyclerAdapter:MainRecyclerAdapter?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artist_detail_page)

        val categoryItemList: MutableList<CategoryItem> = ArrayList()
        categoryItemList.add(CategoryItem(1,R.drawable.androidparty))
        categoryItemList.add(CategoryItem(1,R.drawable.androidparty))
        categoryItemList.add(CategoryItem(1,R.drawable.androidparty))

        val categoryItemList1: MutableList<CategoryItem> = ArrayList()
        categoryItemList1.add(CategoryItem(1,R.drawable.androidparty))
        categoryItemList1.add(CategoryItem(1,R.drawable.androidparty))
        categoryItemList1.add(CategoryItem(1,R.drawable.androidparty))

        val allCategory: MutableList<AllCategory> = ArrayList()
        allCategory.add(AllCategory("Top Tracks",categoryItemList))
        allCategory.add(AllCategory("Top Albums",categoryItemList1))

        setMainCategoryRecycler(allCategory)
    }

    //RecyclerView for top tracks and album fragment
    private fun setMainCategoryRecycler(allCategory: List<AllCategory>) {

        mainCategoryRecycler=findViewById(R.id.TrackAlbumRecyclerView)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        mainCategoryRecycler!!.layoutManager = layoutManager
        mainRecyclerAdapter = MainRecyclerAdapter(this,allCategory)
        mainCategoryRecycler!!.adapter=mainRecyclerAdapter
    }

    //for custom back button
    fun previousPage(view: View){
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}