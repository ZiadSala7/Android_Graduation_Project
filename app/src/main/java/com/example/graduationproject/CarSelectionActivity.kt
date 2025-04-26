package com.example.graduationproject

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.graduationproject.R

import java.io.Serializable

data class Car(
    val name: String,
    val description: String,
    val imageResId: Int,
    val price: Double,
    val rate: Double
) : Serializable


class CarSelectionActivity : AppCompatActivity() {

    private lateinit var tvUsername: TextView

    private fun openCarDetail(car: Car) {
        val intent = Intent(this, CarDetailActivity::class.java)
        intent.putExtra("car", car)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car_selection)

        tvUsername = findViewById(R.id.tv_username)

        // Get username from intent
        val username = intent.getStringExtra("USERNAME") ?: "User"
        tvUsername.text = username

        // Set up click listeners for car cards
        val suzuki = findViewById<CardView>(R.id.suzuki)
        val tesla = findViewById<CardView>(R.id.tesla)
        val audi = findViewById<CardView>(R.id.audi)
        val fila = findViewById<CardView>(R.id.fila)
        val jacketRed = findViewById<CardView>(R.id.jacket_red)
        val jacketYellow = findViewById<CardView>(R.id.jacket_yellow)
        suzuki?.setOnClickListener {
            val car = Car(
                name = "Suzuki Swift",
                description = "Compact car with great fuel economy. Perfect for urban environments and road trips, offering smooth handling and easy parking.",
                imageResId = R.drawable.img_suzuki,
                price = 34.5,
                rate = 4.5
            )
            openCarDetail(car)
        }
        tesla?.setOnClickListener {
            val car = Car(
                name = "Tesla Model S",
                description = "Luxury electric vehicle with impressive speed, advanced autopilot capabilities, and exceptional range. Offers a premium experience with cutting-edge technology and performance.",
                imageResId = R.drawable.img_tesla,
                price = 120.0,
                rate = 4.9
            )
            openCarDetail(car)

        }
        audi?.setOnClickListener {
            val car = Car(
                name = "Audi A4",
                description = "German-engineered sedan with elegant design, premium interior, and smooth performance. Features advanced safety systems and cutting-edge infotainment.",
                imageResId = R.drawable.img_audi,
                price = 89.9,
                rate = 4.6
            )
            openCarDetail(car)

        }
        fila?.setOnClickListener {
            val car = Car(
                name = "FILA Men's Athletic Shorts",
                description = "Lightweight and breathable athletic shorts perfect for workouts and everyday wear. Features moisture-wicking fabric, elastic waistband with drawstring, and deep side pockets.",
                imageResId = R.drawable.img_fila,
                price = 34.5,
                rate = 4.3
            )
            openCarDetail(car)
        }
        jacketRed?.setOnClickListener {
            val car = Car(
                name = "Zip-Front Jacket",
                description = "Stylish and comfortable zip-front jacket, perfect for casual wear. Made with high-quality materials for warmth and durability, designed for all seasons.",
                imageResId = R.drawable.img_jacket_red,
                price = 34.5,
                rate = 4.2
            )
            openCarDetail(car)
        }
        jacketYellow?.setOnClickListener {
            val car = Car(
                name = "Zip-Front Jacket",
                description = "Compact, stylish zip-front jacket designed for comfort and durability. Ideal for outdoor activities and casual wear, offering a perfect balance of warmth and breathability.",
                imageResId = R.drawable.img_jacket_yellow,
                price = 34.5,
                rate = 4.0
            )
            openCarDetail(car)
        }
    }
}
