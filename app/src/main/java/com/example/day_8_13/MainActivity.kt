package com.example.day_8_13

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    //creating key
    companion object{
    const val KEY="com.example.day_8_13.MainActivity.Key"
    }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOrder = findViewById<Button>(R.id.btnorder)
        val et1 = findViewById<EditText>(R.id.et1)
        val et2 = findViewById<EditText>(R.id.et2)
        val et3 = findViewById<EditText>(R.id.et3)
        val et4 = findViewById<EditText>(R.id.et4)

        btnOrder.setOnClickListener {
            val OrderList =
                et1.text.toString() + " " + et2.text.toString() + " " + et3.text.toString() + " " + et4.text.toString()

            intent=Intent(this,OrderActivity2::class.java)
            intent.putExtra(KEY,OrderList)
            startActivity(intent)
        }
    }
}