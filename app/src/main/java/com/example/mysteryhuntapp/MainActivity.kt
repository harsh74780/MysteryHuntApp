package com.example.mysteryhuntapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val locationInput: EditText = findViewById(R.id.locationInput)
        val themeInput: EditText = findViewById(R.id.themeInput)
        val startButton: Button = findViewById(R.id.startButton)

        startButton.setOnClickListener {
            val location = locationInput.text.toString()
            val theme = themeInput.text.toString()

            Log.d("MainActivity", "Location: $location, Theme: $theme")

            val intent = Intent(this, ClueActivity::class.java).apply {
                putExtra("location", location)
                putExtra("theme", theme)
            }
            startActivity(intent)
        }
    }
}
