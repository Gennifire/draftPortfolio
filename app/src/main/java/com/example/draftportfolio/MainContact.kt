package com.example.draftportfolio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainContact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_contact)

        //git hub link button click event
        val gitHubLink = findViewById<Button>(R.id.btnGitHub)
        gitHubLink.setOnClickListener{

            Toast.makeText(this, "github button clicked", Toast.LENGTH_SHORT).show()
            val gitLink = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Gennifire"))
            startActivity(gitLink)
        }

        //Linkedin link button click event
        val linkedInLink = findViewById<Button>(R.id.btnLinkedin)
        linkedInLink.setOnClickListener{

            Toast.makeText(this, "linkedin button clicked", Toast.LENGTH_SHORT).show()
            val linkedinLink = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/jennifer-downes86/"))
            startActivity(linkedinLink)
        }

        //send email to author
        val emailLink = findViewById<Button>(R.id.btnEmail)
        emailLink.setOnClickListener{

            Toast.makeText(this, "email button clicked", Toast.LENGTH_SHORT).show()

            val emailViewLink = Intent(this, MainEmail::class.java)
            startActivity(emailViewLink)

        }
    }
}