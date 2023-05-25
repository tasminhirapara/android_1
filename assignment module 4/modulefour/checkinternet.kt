package com.example.modulefour

import android.annotation.SuppressLint
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class checkinternet : AppCompatActivity()
{ lateinit var btn1: Button

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkinternet)
        btn1= findViewById(R.id.btn1)
        btn1.setOnClickListener()
        {
            if (isNetworkConnected())
            {

                Toast.makeText(applicationContext,"Network is Connected",Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(applicationContext,"DiesConnected " , Toast.LENGTH_SHORT).show()
            }
        }
    }

    @SuppressLint("MissingPermission")
    private fun isNetworkConnected(): Boolean
    {
        val cm = applicationContext.getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
        return cm.activeNetworkInfo != null
    }
}