package com.example.assigmet5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val button = findViewById<Button>(R.id.goBackButton)
        val intent = Intent(this,MainActivity::class.java)
        button.setOnClickListener {
            startActivity(intent)
            this.finish()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val infilater = MenuInflater(this)
        infilater.inflate(R.menu.settings,menu)
        return super.onCreateOptionsMenu(menu)
    }
}