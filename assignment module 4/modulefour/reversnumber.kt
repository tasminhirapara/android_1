package com.example.modulefour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.modulefour.databinding.ActivityReversnumberBinding

class reversnumber : AppCompatActivity()
{
    private lateinit var binding: ActivityReversnumberBinding
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityReversnumberBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.edText.setOnClickListener {

            if (binding.edText.text.toString().isNotEmpty()) {
                val c: StringBuilder = StringBuilder(binding.edText.text.toString())
                binding.tvext.setText(c.reverse())
                Toast.makeText(this, "Inserted", Toast.LENGTH_LONG).show()
            }
            else {
                binding.tvext.setError("Enter NAME")
            }

        }
    }
}