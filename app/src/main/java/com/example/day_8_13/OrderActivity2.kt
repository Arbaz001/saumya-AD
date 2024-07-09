package com.example.day_8_13

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OrderActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.order)
        val TVorder=findViewById<TextView>(R.id.tVOrder)

        val OrdersOfCustomer=intent.getStringExtra(MainActivity.KEY)

        TVorder.text="Order Placed.."+" "+OrdersOfCustomer.toString()
    }
}