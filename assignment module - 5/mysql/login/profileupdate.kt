package com.example.assifive

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import java.lang.reflect.Method

class profileupdate : AppCompatActivity() {
    private lateinit var profileImageView: ImageView

    companion object {
        private const val REQUEST_IMAGE_CAPTURE = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profileupdate)

        profileImageView = findViewById(R.id.profileImageView)
        val selectProfileButton: Button = findViewById(R.id.selectProfileButton)

        selectProfileButton.setOnClickListener {
            dispatchTakePictureIntent()
            
        }
    }

    private fun dispatchTakePictureIntent()
    {
         var name = binding.edt1.text.toString()
            var path = getPath(filepath)
            MultipartUploadRequest(this,"https://tasmin123.000webhostapp.com/API1/upload.php")
                .addFileToUpload(path,"url")
                .addParameter("name",name)
                .setMaxRetries(2)
                . startUpload()
            Toast.makeText(applicationContext,"Success",Toast.LENGTH_LONG).show()
        var stringRequest : StringRequest = object :StringRequest(Method.POST,"https://tasmin123.000webhostapp.com/topsproject/signup.php",Response.Listener {
            Toast.makeText(applicationContext, "Registration done", Toast.LENGTH_SHORT).show()
                                                                                                                                                             },
            Response.ErrorListener {
            Toast.makeText(applicationContext, "No Internet", Toast.LENGTH_SHORT).show()
        }

        ){

            override fun getParams(): MutableMap<String, String>? {
                var map = HashMap<String,String>()
                map["image"] = image
                

                return map
            }

        }
        var queue : RequestQueue = Volley.newRequestQueue(this)
        queue.add(stringRequest)

    }

    

        }
    }




