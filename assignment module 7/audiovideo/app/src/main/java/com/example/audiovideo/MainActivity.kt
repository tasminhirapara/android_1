package com.example.audiovideo

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Toast
import com.example.audiovideo.databinding.ActivityMainBinding
import java.util.Locale

class MainActivity : AppCompatActivity(), MediaPlayer.OnPreparedListener {
    private lateinit var binding: ActivityMainBinding
    lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        var url = "https://tasmin123.000webhostapp.com/adipurus-tune-60349.mp3"
        mediaPlayer = MediaPlayer.create(applicationContext, R.raw.ring)

        binding.btn1.setOnClickListener {

            mediaPlayer.start()

        }


        binding.btn2.setOnClickListener {

            mediaPlayer.stop()

        }
        binding.btn1.setOnClickListener {

            mediaPlayer.setDataSource(url)
            mediaPlayer.prepareAsync()
            mediaPlayer.setOnPreparedListener(this)
            mediaPlayer.start()

        }
        binding.btn3.setOnClickListener {

            mediaPlayer.stop()

        }


    }

    override fun onPrepared(p0: MediaPlayer?)
    {
        mediaPlayer.start()
    }


    }



