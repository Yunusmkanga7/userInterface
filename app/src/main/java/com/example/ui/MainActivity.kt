package com.example.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.ImageView


class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        // Pata views kutoka kwenye layout
        val contactImage = findViewById<ImageView>(R.id.contact_image)
        val contactName = findViewById<TextView>(R.id.contact_name)
        val contactEmail = findViewById<TextView>(R.id.contact_email)
        val contactPhone = findViewById<TextView>(R.id.contact_phone)

        // Pokea data kutoka MainActivity
        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val phone = intent.getStringExtra("phone")

        // Onyesha data kwenye views
        contactName.text = name
        contactEmail.text = email
        contactPhone.text = phone

        // (Optional) Unaweza pia kubadilisha image kama unahitaji
        contactImage.setImageResource(R.drawable.ic_person)
    }
}
