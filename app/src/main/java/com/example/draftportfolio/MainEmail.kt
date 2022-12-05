package com.example.draftportfolio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainEmail : AppCompatActivity() {


    //set variables for sending email
    private lateinit var emailEditText: EditText
    private lateinit var emailEditSubject: EditText
    private lateinit var emailEditMessage: EditText
//    private lateinit var recipientMail: String
//    private lateinit var emailSubject: String
//    private lateinit var emailMessage: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_email)

        //Binding variables with UI elements
        emailEditText = findViewById(R.id.edit_mail_address)
        emailEditSubject = findViewById(R.id.edit_mail_subject)
        emailEditMessage = findViewById(R.id.edit_mail_message)
        var btnSend = findViewById<Button>(R.id.send_email_button)

        btnSend.setOnClickListener {

            if (emailEditText.text.toString().isNotEmpty() && emailEditSubject.text.toString().isNotEmpty()
                && emailEditMessage.text.toString().isNotEmpty()
            ) {
                var sendEmail = Intent(Intent.ACTION_SEND)
                 // sendEmail.putExtra(Intent.EXTRA_EMAIL, emailEditText.text.toString())
                sendEmail.putExtra(Intent.EXTRA_SUBJECT, emailEditSubject.text.toString())
                sendEmail.putExtra(Intent.EXTRA_TEXT, emailEditMessage.text.toString())
                sendEmail.data = Uri.parse("mailto:$emailEditText")

                startActivity(sendEmail)

            } else {
                Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
            }
        }


    }



//    fun sendEmail(view: View){
//        //access data from edit text fields
//        recipientMail = emailEditText.text.toString()
//        emailSubject = emailEditSubject.text.toString()
//        emailMessage = emailEditMessage.text.toString()
//
//        //create Intent
//        val intent = Intent(Intent.ACTION_SEND)
//
//        //provide email address to send to
//        intent.data = Uri.parse(("mailto:$recipientMail"))
//
//        //add extras
//        intent.putExtra(Intent.EXTRA_SUBJECT, emailSubject)
//        intent.putExtra(Intent.EXTRA_TEXT, emailMessage)
//
//        //set email type
//        intent.type = "text/plain"
//
//        //send email
//        startActivity(Intent.createChooser(intent, "Choose how to send email"))
//    }

}