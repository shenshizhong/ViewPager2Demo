package com.ssz.viewpager2demo

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class MainActivity : FragmentActivity() {
    lateinit var viewPager: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager = findViewById(R.id.view_pager)

        viewPager.adapter = object : RecyclerView.Adapter<MyViewHolder>(){

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

                return MyViewHolder(layoutInflater.inflate(R.layout.layout_item,parent,false))
            }
            override fun getItemCount(): Int = 3;
            override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
                holder.textView.text = "viewPager:"+ position
            }
        }

    }
}
class MyViewHolder internal constructor(val layout: View): RecyclerView.ViewHolder(layout){
    var textView: TextView = layout.findViewById(R.id.item_tv)
}