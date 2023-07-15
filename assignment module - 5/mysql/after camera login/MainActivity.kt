package com.example.topsproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    
    private lateinit var imageView: ImageView
    private lateinit var requestQueue: RequestQueue
    private var selectedImageUri: Uri? = null

    companion object {
        private const val REQUEST_IMAGE_PICK = 1
        private const val UPLOAD_URL = "https://example.com/upload"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        val selectImageButton: Button = findViewById(R.id.selectImageButton)
        val uploadButton: Button = findViewById(R.id.uploadButton)

        requestQueue = Volley.newRequestQueue(this)

        selectImageButton.setOnClickListener {
            openImagePicker()
        }

        uploadButton.setOnClickListener {
            selectedImageUri?.let {
                uploadImage(it)
            } ?: run {
                Toast.makeText(this, "Please select an image first", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun openImagePicker() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(intent, REQUEST_IMAGE_PICK)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_IMAGE_PICK && resultCode == RESULT_OK && data != null) {
            selectedImageUri = data.data
            try {
                val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, selectedImageUri)
                imageView.setImageBitmap(bitmap)
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
    }

    private fun uploadImage(imageUri: Uri) {
        try {
            val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, imageUri)
            val byteArrayOutputStream = ByteArrayOutputStream()
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream)
            val imageBytes = byteArrayOutputStream.toByteArray()
            val encodedImage = android.util.Base64.encodeToString(imageBytes, android.util.Base64.DEFAULT)

            val jsonObject = JSONObject()
            jsonObject.put("image", encodedImage)

            val request = object : JsonObjectRequest(Request.Method.POST, UPLOAD_URL, jsonObject,
                Response.Listener { response ->
                    // Handle success response
                    Toast.makeText(this, "Image uploaded successfully", Toast.LENGTH_SHORT).show()
                },
                Response.ErrorListener { error ->
                    // Handle error response
                    Toast.makeText(this, "Error uploading image: ${error.message}", Toast.LENGTH_SHORT).show()
                    Log.e("UploadImage", "Error uploading image", error)
                }) {
                @Throws(AuthFailureError::class)
                override fun getBody(): ByteArray {
                    try {
                        return jsonObject.toString().toByteArray(Charsets.UTF_8)
                    } catch (e: UnsupportedEncodingException) {
                        throw AuthFailureError(e.message)
                    }
                }

                override fun getHeaders(): MutableMap<String, String> {
                    val headers = HashMap<String, String>()
                    headers["Content-Type"] = "application/json"
                    return headers
                }

                override fun parseNetworkResponse(response: NetworkResponse): Response<JSONObject> {
                    try {
                        val jsonString = String(response.data, charset(HttpHeaderParser.parseCharset(response.headers)))
                        return Response.success(JSONObject(jsonString), HttpHeaderParser.parseCacheHeaders(response))
                    } catch (e: JSONException) {
                        return Response.error(e)
                    } catch (e: UnsupportedEncodingException) {
                        return Response.error(e)
                    }
                }
            }

            requestQueue.add(request)
        } catch (e: IOException) {
            e.printStackTrace()
        } catch (e: JSONException) {
            e.printStackTrace()
        }
    }

}
