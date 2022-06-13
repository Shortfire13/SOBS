package com.dicoding.sobs


import android.text.method.TextKeyListener
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SampahAdapter(private val item : ArrayList<String>) : RecyclerView.Adapter<SampahAdapter.ViewHolder>() {
    class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        val textView : TextView = itemView.findViewById(R.id.tv_sampah)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.sampah_layout, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = item[position]
    }

    override fun getItemCount(): Int {
       return item.size
    }

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var photo :ImageView = itemView.findViewById<ImageView>(R.id.iv_photo)
        var sampah : TextView = itemView.findViewById<TextView>(R.id.tv_sampah)
        var harga : TextView = itemView.findViewById<TextView>(R.id.tv_harga)
    }


}
