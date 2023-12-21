package com.example.ez04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class total : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_total)

        val tot: TextView = findViewById(R.id.tot)



        val receivedIntent = intent
        val nrand = receivedIntent.getIntExtra("jumeng", 0)

        tot.setText(nrand.toString())
    }

}