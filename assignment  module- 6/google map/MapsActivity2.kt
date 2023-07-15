package com.example.googlemaps

import android.location.Geocoder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.googlemaps.databinding.ActivityMaps2Binding

class MapsActivity2 : AppCompatActivity(), OnMapReadyCallback {


    private lateinit var map: GoogleMap
    private lateinit var addressEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps2)

        addressEditText = findViewById(R.id.addressEditText)
        val displayMarkerButton: Button = findViewById(R.id.displayMarkerButton)

        val mapFragment =
            supportFragmentManager.findFragmentById(R.id.mapFragment) as SupportMapFragment
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