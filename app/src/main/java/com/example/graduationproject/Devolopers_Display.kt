package com.example.graduationproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Devolopers_Display : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_devolopers_information)

        var githupRepo = findViewById<Button>(R.id.Repo_link)

        githupRepo.setOnClickListener{
            val browserisfds = Intent(Intent.ACTION_VIEW)
            browserisfds.data = Uri.parse("https://github.com/ZiadSala7/Android_Graduation_Project")

            startActivity(browserisfds)

        }
    }
}