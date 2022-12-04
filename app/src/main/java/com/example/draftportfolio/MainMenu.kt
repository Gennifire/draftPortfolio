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

        //Change view to portfolio
        val portbtnClick = findViewById<Button>(R.id.portfolioView)
        portbtnClick.setOnClickListener {
            //toast = pop up message to shoe button clicked
            Toast.makeText(this, "Port Button Clicked", Toast.LENGTH_SHORT).show()
            val portPage = Intent(this, MainPortfolio::class.java)
            startActivity(portPage)
        }

        //change view to contact
        val contactbtnClick = findViewById<Button>(R.id.contactView)
        contactbtnClick.setOnClickListener{
            Toast.makeText(this, "About Button Clicked", Toast.LENGTH_SHORT).show()
            val contactPage = Intent(this, MainContact::class.java)
            startActivity(contactPage)
        }

        //change view to about
        val aboutbtnClick = findViewById<Button>(R.id.aboutView)
        aboutbtnClick.setOnClickListener{
            Toast.makeText(this, "About Button Clicked", Toast.LENGTH_SHORT).show()
            val aboutPage = Intent(this, MainAbout::class.java)
            startActivity(aboutPage)
        }
    }
}