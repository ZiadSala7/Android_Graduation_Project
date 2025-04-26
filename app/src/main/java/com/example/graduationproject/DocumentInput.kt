package com.example.graduationproject


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class DocumentInput : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // ← replace with your actual layout resource name:
        setContentView(R.layout.activity_reservation_document_input)

        var confirmbtn = findViewById<Button>(R.id.buttonConfirm)
        var editTextFirstName = findViewById<EditText>(R.id.editTextFirstName)
        var editTextLastName = findViewById<EditText>(R.id.editTextLastName)
        var editTextPhone = findViewById<EditText>(R.id.editTextPhone)
        var editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        var checkBox2Months = findViewById<CheckBox>(R.id.checkBox2Months)
        var checkBox3Months = findViewById<CheckBox>(R.id.checkBox3Months)

        confirmbtn.setOnClickListener{
            val intent = Intent(this, DisplayActivity::class.java).apply {
                putExtra("first_name",       editTextFirstName.text.toString().trim())
                putExtra("last_name",        editTextLastName .text.toString().trim())
                putExtra("phone",            editTextPhone    .text.toString().trim())
                putExtra("email",            editTextEmail    .text.toString().trim())
                putExtra("reservation_type", when {
                    checkBox2Months.isChecked -> "2-months"
                    checkBox3Months.isChecked -> "3-months"
                    else                       -> ""
                })
            }
            startActivity(intent)
        }

    }
}
