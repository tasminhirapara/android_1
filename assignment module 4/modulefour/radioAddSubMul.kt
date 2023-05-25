package com.example.modulefour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.modulefour.databinding.ActivityRadioAddSubMulBinding

class radioAddSubMul : AppCompatActivity()
{
    private lateinit var binding: ActivityRadioAddSubMulBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRadioAddSubMulBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.rdadd.setOnClickListener {

            if (binding.edit.toString() != "" && binding.edit1.toString() != "") {
                var no1 = binding.edit.text.toString().toFloat()
                var no2 = binding.edit1.text.toString().toFloat()
                var result = no1 +no2
                var per = (no1 + no2) * 100 / 200
                binding.tvText.text = "The sum is $result per : $per "
                println("$result  per : $per " )
            }
        }
        binding.sub.setOnClickListener {

            if (binding.sub.isChecked) {
                var no = binding.edit.text.toString().toFloat()
                var no2 = binding.edit1.text.toString().toFloat()
                var result = no - no2
                var per = (no+ no2) * 100 / 200
                binding.tvText.text = "The Sub is $result per : $per "
                println("$result  per : $per " )
            }
        }
        binding.multi.setOnClickListener {
            if (binding.multi.isChecked) {
                var no = binding.edit.text.toString().toFloat()
                var no2 = binding.edit1.text.toString().toFloat()
                var sub = no * no2
                var per = (no + no2) * 100 / 200
                Toast.makeText(applicationContext, "mutli is Total $sub per: $per", Toast.LENGTH_SHORT).show()
            }
        }
    }
}