package com.example.graduationproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.example.graduationproject.R

class LoginActivity : AppCompatActivity() {

    //private lateinit var etName: TextInputEditText
    //private lateinit var btnLogin: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

       var etName = findViewById<TextInputEditText>(R.id.et_name)
       var btnLogin = findViewById<MaterialButton>(R.id.btn_login)

        btnLogin.setOnClickListener {
            val username = etName.text.toString()
            val intent = Intent(this, CarSelectionActivity::class.java)
            intent.putExtra("USERNAME", username)
            startActivity(intent)
        }
    }
}
