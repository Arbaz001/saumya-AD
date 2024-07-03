package com.example.day_1

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonupload=findViewById<Button>(R.id.btnUpload)
        val buttondownload=findViewById<Button>(R.id.btnDownload)

        buttonupload.setOnClickListener {
            Toast.makeText(applicationContext,"Uploading..",Toast.LENGTH_SHORT).show()
        }
        buttondownload.setOnClickListener {
            Toast.makeText(applicationContext,"Downloading..",Toast.LENGTH_SHORT).show()
        }
    }
}