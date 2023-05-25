package com.example.modulefour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.modulefour.databinding.ActivityCheckboxBinding

class checkbox : AppCompatActivity()
{
    private lateinit var binding: ActivityCheckboxBinding
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckboxBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

       binding.check1.setOnCheckedChangeListener { compoundButton, b ->
            if (binding.check1.isChecked) {

                Toast.makeText(applicationContext, "Checked", Toast.LENGTH_SHORT).show()
                binding.txt1. visibility = View.VISIBLE
            }
            else if (!binding.check1.isChecked)
            {
                Toast.makeText(applicationContext, "UnChecked", Toast.LENGTH_SHORT).show()
                binding.txt1. visibility = View.INVISIBLE
            }
        }
    }
}