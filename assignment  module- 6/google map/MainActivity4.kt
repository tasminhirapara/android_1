package com.example.googlemaps

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity4 : AppCompatActivity() {
    private lateinit var animationImageView: ImageView
    private lateinit var animationDrawable: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        animationImageView = findViewById(R.id.animationImageView)

        // Set animation frames
        animationDrawable = AnimationDrawable().apply {
            addFrame(getDrawable(R.drawable.image1)!!, 100)
            addFrame(getDrawable(R.drawable.image2)!!, 100)
            addFrame(getDrawable(R.drawable.image3)!!, 100)
            addFrame(getDrawable(R.drawable.image4)!!, 100)
            addFrame(getDrawable(R.drawable.image5)!!, 100)
            addFrame(getDrawable(R.drawable.image6)!!, 100)
        }

        // Set animation to ImageView
        animationImageView.setImageDrawable(animationDrawable)

        // Start the animation
        animationDrawable.start()
    }

    override fun onDestroy() {
        super.onDestroy()

        // Stop the animation when the activity is destroyed
        animationDrawable.stop()
    }
}
}