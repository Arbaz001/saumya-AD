package com.example.day_4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn=findViewById<Button>(R.id.button)

        btn.setOnClickListener{
            //open a new activity
            intent= Intent(applicationContext,secondActivity::class.java)
            startActivity(intent)
          }
        }
    }