package com.example.audiovideo

import android.content.Context
import android.net.wifi.WifiManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.audiovideo.databinding.ActivityWifionoffBinding

class wifionoff : AppCompatActivity()
{
    private lateinit var wifiManager: WifiManager
    private lateinit var binding: ActivityWifionoffBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWifionoffBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        wifiManager = applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager

        val toggleWifiButton: Button = findViewById(R.id.toggleWifiButton)
        toggleWifiButton.setOnClickListener {
            toggleWifi()
        }
    }

    private fun toggleWifi() {
        if (wifiManager.isWifiEnabled) {
            wifiManager.isWifiEnabled = false
            Toast.makeText(this, "off", Toast.LENGTH_SHORT).show()
        } else {
            wifiManager.isWifiEnabled = true
            Toast.makeText(this, "on", Toast.LENGTH_SHORT).show()
        }
    }
}