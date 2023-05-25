package com.example.modulefour

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivityshowe : AppCompatActivity()
{
    lateinit var txt1 : TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityshowe)
        txt1 = findViewById(R.id.txt1)
        var i = intent
       var data = i.getStringExtra("BILL")
        txt1.setText(data)
    }
}