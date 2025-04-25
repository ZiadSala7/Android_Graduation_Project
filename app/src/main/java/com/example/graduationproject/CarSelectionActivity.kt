package com.example.graduationproject

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.graduationproject.R

class CarSelectionActivity : AppCompatActivity() {

    //private lateinit var tvUsername: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car_selection)

        var tvUsername = findViewById<TextView>(R.id.tv_username)

        // Get username from intent
        val username = intent.getStringExtra("USERNAME") ?: "User"
        tvUsername.text = username

        // Set up click listeners for car cards
        val teslaCard = findViewById<CardView>(R.id.card)
        teslaCard?.setOnClickListener {
            startActivity(Intent(this, CarDetailActivity::class.java))
        }
    }
}
