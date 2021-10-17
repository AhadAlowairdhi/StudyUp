package com.example.studyupapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class kotlinA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        val Cousres = listOf(
            Cousre("var and val","Declaring variables"),
            Cousre("User Input","Getting user input"),
            Cousre("Data Types","Understanding data types"),
            Cousre("Basic Operation","Performing math operations in Android")
        )

        val rvKotlin = findViewById<RecyclerView>(R.id.rvAndroid)
        rvKotlin.adapter = ViewAdapter(Cousres)
        rvKotlin.layoutManager = LinearLayoutManager(this)

    }
}