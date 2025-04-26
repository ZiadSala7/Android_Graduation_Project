package com.example.graduationproject

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_info)

        // 1) Find your views
        val tvFullname   = findViewById<TextView>(R.id.textViewFullName)
        val tvPhone       = findViewById<TextView>(R.id.textViewPhone)
        val tvEmail       = findViewById<TextView>(R.id.textViewEmail)
        val tvReservation = findViewById<TextView>(R.id.textViewReservation)
        val btnConfirm    = findViewById<Button>(R.id.buttonConfirm)

        // 2) Pull data out of the Intent
        val firstName       = intent.getStringExtra("first_name")       ?: ""
        val lastName        = intent.getStringExtra("last_name")        ?: ""
        val phone           = intent.getStringExtra("phone")            ?: ""
        val email           = intent.getStringExtra("email")            ?: ""
        val reservationType = intent.getStringExtra("reservation_type") ?: ""

        // 3) Populate your TextViews
        tvFullname   .text = "First Name : $firstName $lastName"
        tvPhone      .text = "Phone Number: $phone"
        tvEmail      .text = "Email: $email"
        tvReservation.text = "Reservation Type: $reservationType"

        // 4) Confirm button just finishes this screen
        btnConfirm.setOnClickListener {
            Toast.makeText(this, "Car has Reserved Successfully", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
