package com.example.modulefour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.modulefour.databinding.ActivityLoginactivityBinding

class loginactivity : AppCompatActivity()
{
    private lateinit var binding: ActivityLoginactivityBinding
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginactivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btn1.setOnClickListener {
            var f =firstFragment()
            var fm = supportFragmentManager
            var ft = fm.beginTransaction()
            ft.replace(R.id.frmid,f).commit()
        }

        binding.btn2.setOnClickListener {
            var f =secondFragment()
            var fm = supportFragmentManager
            var ft = fm.beginTransaction()
            ft.replace(R.id.frmid,f).commit()

        }
    }
}