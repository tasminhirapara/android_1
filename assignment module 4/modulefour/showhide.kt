package com.example.modulefour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.modulefour.databinding.ActivitySeekbarBinding
import com.example.modulefour.databinding.ActivityShowhideBinding

class showhide : AppCompatActivity()
{
    private lateinit var binding: ActivityShowhideBinding
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityShowhideBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btn1.setOnClickListener {

            binding.tvText.visibility = View.INVISIBLE

            Toast.makeText(applicationContext, "Text is Hidden ", Toast.LENGTH_SHORT).show()
        }
        binding.btn2.setOnClickListener {

            binding.tvText.visibility = View.VISIBLE

            Toast.makeText(applicationContext, "Text is Show ", Toast.LENGTH_SHORT).show()
        }

    }
}