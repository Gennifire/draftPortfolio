package com.example.draftportfolio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button click event listener from main page
        val btnClick = findViewById<Button>(R.id.button)
        btnClick.setOnClickListener {
            //toast
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT ).show()
            val nextPage = Intent(this, MainMenu::class.java)
            startActivity(nextPage)


        }

    }

}