package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonInvestment = findViewById<Button>(R.id.button_Investment)
        buttonInvestment.setOnClickListener {
            val intent = Intent( this , Investment::class.java)
            startActivity(intent);
        }
        val buttonWeather = findViewById<Button>(R.id.button_weather)
        buttonWeather.setOnClickListener {
            val intent = Intent( this , weather::class.java)
            startActivity(intent);
        }

        val buttonAboutMe = findViewById<Button>(R.id.button_facts)
        buttonAboutMe.setOnClickListener {
            val intent = Intent( this , Aboutme::class.java)
            startActivity(intent);
        }

        val buttonResume = findViewById<Button>(R.id.button_resume)
        buttonResume.setOnClickListener {
            val intent = Intent( this , Resume::class.java)
            startActivity(intent);
        }

    }


}
