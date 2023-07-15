package com.example.googlemaps

import android.location.Geocoder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.model.AutocompleteSessionToken
import com.google.android.libraries.places.api.net.PlacesClient

class MapsActivity3 : AppCompatActivity() {

    private lateinit var placesClient: PlacesClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps3)

        // Initialize Places API
        Places.initialize(applicationContext, "YOUR_API_KEY")
        placesClient = Places.createClient(this)

        // Initialize AutoCompleteTextView
        val autoCompleteTextView: AutoCompleteTextView = findViewById(R.id.placeAutoCompleteTextView)
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line)
        autoCompleteTextView.setAdapter(adapter)

        // Enable Place Autocomplete predictions
        autoCompleteTextView.setOnItemClickListener { _, _, position, _ ->
            val selectedPlace = adapter.getItem(position).toString()
            autoCompleteTextView.setText(selectedPlace)
        }

        // Fetch Place Autocomplete predictions as user types
        autoCompleteTextView.addTextChangedListener()
        {
            val token = AutocompleteSessionToken.newInstance()
            val request = com.google.android.libraries.places.api.model.AutocompleteRequest.builder()
                    .setTypeFilter(TypeFilter.ADDRESS)
                    .setSessionToken(token)
                    .setQuery(it.toString())
                    .build()
            placesClient.findAutocompletePredictions(request).addOnSuccessListener { response ->
                val predictions = response.autocompletePredictions
                val places =
                    predictions.map { prediction -> prediction.getFullText(null).toString() }
                adapter.clear()
                adapter.addAll(places)
            }
        }
    }


}