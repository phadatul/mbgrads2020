package com.hsbc.newcardskotlin

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    var selectedImage: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        selectedImage = findViewById<View>(R.id.selectedImage) as ImageView // init a ImageView
        val intent = intent // get Intent which we set from Previous Activity
        selectedImage!!.setImageResource(
            intent.getIntExtra(
                "image",
                0
            )
        ) // get image from Intent and set it in ImageView
    }
}