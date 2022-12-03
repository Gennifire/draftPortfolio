package com.example.draftportfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainmenu)

        val portbtnClick = findViewById<Button>(R.id.portfolioView)

        portbtnClick.setOnClickListener {

            Toast.makeText(this, "Port Button Clicked", Toast.LENGTH_SHORT).show()
            val portPage = Intent(this, MainPortfolio::class.java)
            startActivity(portPage)
        }
    }
}