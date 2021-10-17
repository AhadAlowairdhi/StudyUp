package com.example.studyupapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var androidBt: Button
    lateinit var kotlinBt: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        androidBt = findViewById(R.id.btn1)
        kotlinBt = findViewById(R.id.btn2)


        androidBt.setOnClickListener {
            startActivity(Intent(this, androidA::class.java))
        }
        kotlinBt.setOnClickListener {
            startActivity(Intent(this, kotlinA::class.java))
        }
    }
}