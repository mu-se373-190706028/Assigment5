package com.example.assigmet5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val setImageButton = findViewById<Button>(R.id.setImageButton)
        val image = findViewById<ImageView>(R.id.imageView)
        val nextPageButton = findViewById<Button>(R.id.nextPageButton)
        val nameList = findViewById<ListView>(R.id.listName)
        val meyveler = listOf<String>("Muz","Armut","Cilek","Karpuz","Erik","Elma")
        val adapter = ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,meyveler)

        nameList.adapter = adapter
        setImageButton.setOnClickListener {
            image.setImageResource(R.drawable.image)

        }
        nextPageButton.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

    }



}