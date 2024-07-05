package com.example.day_5

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val webbtn=findViewById<CardView>(R.id.CardWeb)
         val camerabtn=findViewById<CardView>(R.id.CardCamera)
         val Videobtn=findViewById<CardView>(R.id.CardVideo)

        webbtn.setOnClickListener{
           val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://chatgpt.com/?oai-dm=1")
            startActivity(intent)
        }
        camerabtn.setOnClickListener {
            val intent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
         }
        Videobtn.setOnClickListener {
            val intent=Intent(MediaStore.ACTION_VIDEO_CAPTURE)
            startActivity(intent)
        }
        }
    }
