package com.example.modulefour

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import com.example.modulefour.databinding.ActivityRadiocolorchangeBinding
import com.example.modulefour.databinding.ActivitySeekbarBinding

class radiocolorchange : AppCompatActivity()
{
    private lateinit var binding: ActivityRadiocolorchangeBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityRadiocolorchangeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.rg.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->


            when(i){
                R.id.rvRadioBtn1 ->
                {

                    binding.liner.setBackgroundColor(Color.BLUE)
                }
                R.id.rvRadioBtn2 ->
                {
                    binding.liner.setBackgroundColor(Color.RED)
                }
            }
        })

    }
}