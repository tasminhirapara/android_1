package com.example.modulefour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.modulefour.databinding.ActivityIncreatefountsizeBinding

class increatefountsize : AppCompatActivity() {
    private lateinit var binding: ActivityIncreatefountsizeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIncreatefountsizeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        var increment_number = 1

        binding.btnPlus.setOnClickListener {
            increment_number++
            binding.tvTest.setTextSize(increment_number.toFloat())
        }
        binding.btnMinus.setOnClickListener {
            increment_number--
            binding.tvTest.setTextSize(increment_number.toFloat())
        }
    }
}