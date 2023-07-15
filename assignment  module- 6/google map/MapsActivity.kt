package com.example.googlemaps

import android.Manifest
import android.content.pm.PackageManager
import android.location.Geocoder
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.location.LocationManager.GPS_PROVIDER
import android.location.LocationManager.NETWORK_PROVIDER
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.app.ActivityCompat

import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.googlemaps.databinding.ActivityMapsBinding
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.*
import java.util.Objects as Objects1

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {


    private lateinit var map: GoogleMap
    private lateinit var addressEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        addressEditText = findViewById(R.id.addressEditText)
        val displayMarkerButton: Button = findViewById(R.id.displayMarkerButton)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.mapFragment) as SupportMapFragment
        mapFragment.getMapAsync(this)

        displayMarkerButton.setOnClickListener {
            val address = addressEditText.text.toString()
            val geocoder = Geocoder(this)
            val addresses = geocoder.getFromLocationName(address, 1)
            if (addresses!!.isNotEmpty()) {
                val location = LatLng(addresses[0].latitude, addresses[0].longitude)
                map.addMarker(MarkerOptions().position(location))
                map.animateCamera(CameraUpdateFactory.newLatLngZoom(location, 15f))
            }
        }
    }

    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap
    }
}
