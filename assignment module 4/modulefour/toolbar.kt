package com.example.modulefour

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.SearchView
import android.widget.Toast
import com.example.modulefour.databinding.ActivityToolbarBinding

class toolbar : AppCompatActivity(), AdapterView.OnItemSelectedListener {
     private lateinit var binding: ActivityToolbarBinding
    lateinit var list: MutableList<String>
    var arr = arrayOf("Rajkot ", "Surat ","Amreli ", "Dhari")
    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        binding = ActivityToolbarBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        list = ArrayList()
        //  setSupportActionBar(binding.toolbar)

        list.add("Rajkot")
        list.add("shruti")
        list.add("Java")
        list.add("Rajkot")
        list.add("Rajkot")

        var adapter =
            ArrayAdapter<String>(applicationContext, android.R.layout.simple_list_item_1, list)
        binding.listItem.adapter = adapter


        var adapter1 = ArrayAdapter(applicationContext, R.layout.simple_spinner_dropdown_item,arr)
        binding.spinner.adapter = adapter1

        binding.spinner.onItemSelectedListener = this


        binding.serch.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(p0: String?): Boolean {

                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                adapter.filter.filter(p0)
                return true
            }
        })

    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        Toast.makeText(applicationContext,""+arr[p2], Toast.LENGTH_SHORT).show()
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }
}