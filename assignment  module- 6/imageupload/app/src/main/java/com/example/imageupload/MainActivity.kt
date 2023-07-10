package com.example.imageupload

import android.Manifest.permission.READ_EXTERNAL_STORAGE
import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.example.imageupload.databinding.ActivityMainBinding
import net.gotev.uploadservice.MultipartUploadRequest

class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding
    lateinit var filepath: Uri
    lateinit var  bitmap: Bitmap

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        if (checkSelfPermission(READ_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this, arrayOf(READ_EXTERNAL_STORAGE),101)
        }
        else
        {
            Toast.makeText(applicationContext,"you are permission will alredy given", Toast.LENGTH_LONG).show()
        }


        binding.btn1.setOnClickListener {

            var i = Intent()
            i.setType("image/*")
            i.action = Intent.ACTION_GET_CONTENT
            startActivityForResult(Intent.createChooser(i, " please Select Picture"), 1)

        }
        binding.btn2.setOnClickListener {

            var name = binding.edt1.text.toString()
            var path = getPath(filepath)
            MultipartUploadRequest(this,"https://tasmin123.000webhostapp.com/API1/upload.php")
                .addFileToUpload(path,"url")
                .addParameter("name",name)
                .setMaxRetries(2)
                . startUpload()
            Toast.makeText(applicationContext,"Success",Toast.LENGTH_LONG).show()
        }

    }
    @SuppressLint("Range")
    fun getPath(uri: Uri?): String
    {
        var cursor = contentResolver.query(uri!!, null, null, null, null)
        cursor!!.moveToFirst()
        var document_id = cursor.getString(0)
        document_id = document_id.substring(document_id.lastIndexOf(":") + 1)
        cursor.close()
        cursor = contentResolver.query(
            MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
            null, MediaStore.Images.Media._ID + " = ? ", arrayOf(document_id), null)
        cursor!!.moveToFirst()
        val path = cursor.getString(cursor.getColumnIndex(MediaStore.Images.Media.DATA))
        cursor.close()
        return path
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode==1&& resultCode== RESULT_OK && data!= null)
        {
            filepath= data.data!!
            bitmap = MediaStore.Images.Media.getBitmap(contentResolver,filepath)
            binding.img.setImageBitmap(bitmap)
        }

        super.onActivityResult(requestCode, resultCode, data)
    }


}

