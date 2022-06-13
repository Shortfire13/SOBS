package com.dicoding.sobs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn_setor : CardView = findViewById(R.id.btn_setor)
        val recyclerView : RecyclerView = findViewById(R.id.rv_sampah)
        val adapter = SampahAdapter(fetchData())
        recyclerView.layoutManager = GridLayoutManager(this,2)
        recyclerView.adapter = adapter
        btn_setor.setOnClickListener(){
            val setorIntent = Intent(this,
                SetorActivity::class.java)
            startActivity(setorIntent)
        }
    }

    private fun fetchData() : ArrayList<String> {
        val item = ArrayList<String>()
        for (i in 0 until 4) {
            item.add("$i")
        }
        return item
    }
}