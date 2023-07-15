package com.example.audiovideo

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class videoplay : AppCompatActivity() {
    lateinit var videoView: VideoView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videoplay)

        videoView = findViewById(R.id.vd)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        val video: Uri = Uri.parse("https://tasmin123.000webhostapp.com/tasmin__1501__-20211126-0001.mp4")
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(video)
        videoView.start()
    }
}