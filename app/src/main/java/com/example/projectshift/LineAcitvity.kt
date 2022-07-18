package com.example.projectshift

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.line_uslug_activity.*
import kotlinx.android.synthetic.main.sidebar.*

class LineAcitvity:AppCompatActivity(), OnButtonClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.line_uslug_activity)

        burger_button_inline.setOnClickListener {
            drawer_inline.openDrawer(GravityCompat.START)
        }

        val recyclerView: RecyclerView = findViewById(R.id.recycler_sidebar)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerAdapter(this)
    }

    override fun onButtonItemClicked(position: Int) {

        when(position){
            0 ->{
                val goLentUsl = Intent(this, LineAcitvity::class.java)
                drawer_inline.closeDrawer(GravityCompat.START)
                startActivity(goLentUsl)


            }
            1 ->{
                val goLentUsl = Intent(this, CreateUslActivity::class.java)
                drawer_inline.closeDrawer(GravityCompat.START)
                startActivity(goLentUsl)
            }
            2 ->{
                val goLentUsl = Intent(this, MySetActivity::class.java)
                drawer_inline.closeDrawer(GravityCompat.START)
                startActivity(goLentUsl)
            }
            3 ->{
                val goLentUsl = Intent(this, MyShopActivity::class.java)
               drawer_inline.closeDrawer(GravityCompat.START)
                startActivity(goLentUsl)
            }
        }

    }


}