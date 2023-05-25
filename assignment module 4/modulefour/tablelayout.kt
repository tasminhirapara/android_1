package com.example.modulefour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

class tablelayout : AppCompatActivity() {

    lateinit var tableLayout: android.widget.TableLayout
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_tablelayout)
        tableLayout = TableLayout(this)
        val row = TableRow(this)

        var tv = TextView(this)
        tv.setText("this is text view ")


        var row1 = TableRow(this)
        var tv1 = TextView(this)
        tv1.setText("this is txt")

        tableLayout.addView(row)
        row.addView(tv)

        tableLayout.addView(row1)
        row1.addView(tv1)

        setContentView(tableLayout)
    }
}