package com.example.modulefour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class stringarray : AppCompatActivity()
{  lateinit var  list1: ListView
    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stringarray)
        list1 = findViewById(R.id.list1)

        val language:Array<String> = resources.getStringArray(R.array.heading)
        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,language)
        list1.adapter = arrayAdapter

    }
}