package com.example.modulefour

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class MainActivitybill : AppCompatActivity() {
    lateinit var chk1: CheckBox
    lateinit var chk2: CheckBox
    lateinit var btn1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activitybill)
        chk1 = findViewById(R.id.chk1)
        chk2 = findViewById(R.id.chk2)
        btn1.setOnClickListener {
            var amount = 0
            var builder = StringBuilder("")
            builder.append("\n selected Items \n")
            if (chk1.isChecked) {
                builder.append("\n Pizza @ Rs. 400 \n")
                amount += 400
            }
            if (chk2.isChecked) {
                builder.append("\n Burger @ Rs. 110 \n")
                amount += 110
            }

            var i = Intent(applicationContext, MainActivityshowe::class.java)
            i.putExtra("BILL", builder.toString())
            startActivity(i)
        }
    }
}

