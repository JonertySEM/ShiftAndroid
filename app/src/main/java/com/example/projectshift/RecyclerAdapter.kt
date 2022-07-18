package com.example.projectshift

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.projectshift.databinding.LineUslugActivityBinding
import kotlinx.android.synthetic.main.line_uslug_activity.*



class RecyclerAdapter(private val onButtonClickListener: OnButtonClickListener):  RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>(){

    val massStr = arrayListOf<String>("Лента Услуг", "Создать услугу", "Мои услуги", "Мои заказы")



    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val largeTextView = itemView.findViewById<TextView>(R.id.text_sidebar)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item_sidebar, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.largeTextView.text = massStr[position]

        holder.itemView.setOnClickListener{
            onButtonClickListener.onButtonItemClicked(position)
        }


    }

    override fun getItemCount() = massStr.size


}







