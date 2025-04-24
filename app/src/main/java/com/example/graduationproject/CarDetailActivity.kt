package com.example.graduationproject

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.example.graduationproject.R


class CarDetailActivity : AppCompatActivity() {

    private lateinit var btnBack: ImageButton
    private lateinit var btnReserve: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car_detail)

        btnBack = findViewById(R.id.btn_back)
        btnReserve = findViewById(R.id.btn_reserve)

        btnBack.setOnClickListener {
            finish()
        }
        btnReserve.setOnClickListener {
            Toast.makeText(this, "Car reserved successfully!", Toast.LENGTH_SHORT).show()
        }
    }
}
