package com.example.graduationproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
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
        var besobtn = findViewById<Button>(R.id.beso)


        besobtn.setOnClickListener{
            val intent = Intent(this, Devolopers_Display::class.java)

            startActivity(intent)
        }

        btnLogin.setOnClickListener {
            val username = etName.text.toString()
            if(username != "" && username != null){
                val intent = Intent(this, CarSelectionActivity::class.java)
                intent.putExtra("USERNAME", username)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Please Enter Your name", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
