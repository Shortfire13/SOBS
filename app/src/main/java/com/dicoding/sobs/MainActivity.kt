package com.dicoding.sobs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView : RecyclerView = findViewById(R.id.rv_sampah)
        val adapter = SampahAdapter(fetchData())
        recyclerView.layoutManager = GridLayoutManager(this,2)
        recyclerView.adapter = adapter
    }

    private fun fetchData() : ArrayList<String> {
        val item = ArrayList<String>()
        for (i in 0 until 4) {
            item.add("$i")
        }
        return item
    }
}