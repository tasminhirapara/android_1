package com.example.audiovideo

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView

class splashscreenwithslider : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreenwithslider)

        val logoImageView = findViewById<ImageView>(R.id.logoImageView)
        val animation = AnimationUtils.loadAnimation(this, R.anim.splash_animation)
        logoImageView.startAnimation(animation)

        Handler().postDelayed({

            startActivity(Intent(applicationContext,MainActivity::class.java))

        },5000)

    }
}