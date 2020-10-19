package com.hsbc.newcardskotlin

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class CustomAdapter(
    var context: Context,
    var personNames: ArrayList<*>,
    var personImages: ArrayList<*>
) :
    RecyclerView.Adapter<CustomAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
// infalte the item Layout
        val v = LayoutInflater.from(parent.context).inflate(R.layout.rowlayout, parent, false)
        // set the view's size, margins, paddings and layout parameters
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
// set the data in items
        holder.name.text = personNames[position].toString()
        holder.image.setImageResource((personImages[position] as Int))
        // implement setOnClickListener event on item view.
        holder.itemView.setOnClickListener {
            // open another activity on item click
            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra("image", personImages[position] as Int) // put image data in Intent
            context.startActivity(intent) // start Intent
        }
    }

    override fun getItemCount(): Int {
        return personNames.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // init the item view's
        var name: TextView
        var image: ImageView

        init {

// get the reference of item view's
            name = itemView.findViewById<View>(R.id.name) as TextView
            image = itemView.findViewById<View>(R.id.image) as ImageView
        }
    }
}
