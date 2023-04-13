package com.example.myapplication3

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication3.databinding.ActivityLoginscreenBinding

class loginscreen : AppCompatActivity() {
    private lateinit var binding: ActivityLoginscreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginscreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        var sharedPreferences = getSharedPreferences("tasmin", MODE_PRIVATE)
        if (sharedPreferences.getBoolean("tasmin",false) && !sharedPreferences.getString("name","")!!.isEmpty())
        {
            startActivity(Intent(applicationContext, MainActivity::class.java))
            finish()
        }
        else {
            binding.btn1.setOnClickListener() {
                val name = binding.ed1.text.toString()
                val pass = binding.ed2.text.toString()
                if(name.length==0 && pass.length==0)
                {binding.ed1.setError("please enter your Enrollment")
                    binding.ed2.setError("please enter your Phonenumber")
                }
                else if(name.length==0)
                {
                    binding.ed1.setError("please enter your enrollment")
                }
                else if (pass.length==0)
                {
                    binding.ed2.setError("please enter your Phonenumber")
                }
                else
                {
                    val i = Intent(applicationContext, MainActivity::class.java)
                    val edit: SharedPreferences.Editor = sharedPreferences.edit()
                    edit.putBoolean("tasmin", true)
                    edit.putString("name", name)
                    edit.putString("pass", pass)
                    edit.commit()
                    startActivity(i)
                }
            }
        }
    }

    override fun onBackPressed() {
       finishAffinity()
    }
}