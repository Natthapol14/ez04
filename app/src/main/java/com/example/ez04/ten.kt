package com.example.ez04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ten : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ten)

        val k1: Button = findViewById(R.id.k1)
        val k2: Button = findViewById(R.id.k2)
        val k3: Button = findViewById(R.id.k3)
        val k4: Button = findViewById(R.id.k4)

        val receivedIntent = intent
        val nrand = receivedIntent.getIntExtra("jumeng", 0)


        k4.setOnClickListener {
            val intent = Intent(this, total::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        k3.setOnClickListener {
            val intent = Intent(this, total::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        k2.setOnClickListener {
            val intent = Intent(this, total::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        k1.setOnClickListener {
            val intent = Intent(this, total::class.java)
            intent.putExtra("jumeng", nrand +1)
            startActivity(intent)
        }
    }
}