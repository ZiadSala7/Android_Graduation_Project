package com.example.graduationproject
import android.content.Intent
import android.widget.TextView
import android.widget.ImageView

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.example.graduationproject.R


class CarDetailActivity : AppCompatActivity() {

    //private lateinit var btnBack: ImageButton
    //private lateinit var btnReserve: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car_detail)

        var btnBack = findViewById<ImageButton>(R.id.btn_back)
        var btnReserve = findViewById<MaterialButton>(R.id.btn_reserve)

        btnBack.setOnClickListener {
            finish()
        }
        // Get Car Details From Cars View

        @Suppress("DEPRECATION")
        val car = intent.getSerializableExtra("car") as? Car

        val carImage = findViewById<ImageView>(R.id.iv_car)
        val carName = findViewById<TextView>(R.id.tv_car_name)
        val carDescription = findViewById<TextView>(R.id.tv_description)
        val carRate = findViewById<TextView>(R.id.tv_rating)
        val carPrice = findViewById<TextView>(R.id.tv_price)

        car?.let {
            carImage.setImageResource(it.imageResId)
            carName.text = it.name.toString()
            carDescription.text = it.description.toString()
            carRate.text = it.rate.toString()
            carPrice.text = it.price.toString()
        }

        btnReserve.setOnClickListener {
            val intent = Intent(this, DocumentInput::class.java)
            startActivity(intent)
        }
    }
}
