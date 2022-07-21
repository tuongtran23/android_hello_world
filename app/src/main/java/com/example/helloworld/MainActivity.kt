package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

// This Kotlin file is where we are going to be handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Show this layout file: activity_main
        setContentView(R.layout.activity_main)

        // user can tap a button to change the text color of label
        // 1. Add a button to our layout

        // Get a reference to button
        findViewById<Button>(R.id.button).setOnClickListener{
            // Handle button tap
            // a. Change color of the text
            Log.i("Cody", "Tapped on button")
            // 1. Get a reference to the text view
            // 2. Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))

        }
    }
}