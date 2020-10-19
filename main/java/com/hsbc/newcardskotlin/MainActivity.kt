package com.hsbc.newcardskotlin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {

    // ArrayList for person names
    var personNames: ArrayList<*> = ArrayList(Arrays.asList("Person 1", "Person 2", "Person 3", "Person 4", "Person 5", "Person 6", "Person 7", "Person 8", "Person 9", "Person 10", "Person 11", "Person 12", "Person 13", "Person 14"))
    var personImages: ArrayList<*> = ArrayList(Arrays.asList<Any>(R.drawable.mango, R.drawable.pineapple, R.drawable.ic_launcher_background, R.drawable.mango, R.drawable.mango, R.drawable.pineapple, R.drawable.mango, R.drawable.pineapple, R.drawable.ic_launcher_background, R.drawable.mango, R.drawable.pineapple, R.drawable.pineapple, R.drawable.mango, R.drawable.mango))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // get the reference of RecyclerView
        val recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
        // set a LinearLayoutManager with default vertical orientaion
        val linearLayoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = linearLayoutManager // set LayoutManager to RecyclerView
        // call the constructor of CustomAdapter to send the reference and data to Adapter
        val customAdapter = CustomAdapter(this@MainActivity, personNames, personImages)
        recyclerView.adapter = customAdapter // set the Adapter to RecyclerView
    }
}