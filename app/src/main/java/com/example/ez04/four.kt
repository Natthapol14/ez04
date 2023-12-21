package com.example.ez04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class four : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)
        val e1: Button = findViewById(R.id.e1)
        val e2: Button = findViewById(R.id.e2)
        val e3: Button = findViewById(R.id.e3)
        val e4: Button = findViewById(R.id.e4)

        val receivedIntent = intent
        val nrand = receivedIntent.getIntExtra("jumeng", 0)


        e4.setOnClickListener {
            val intent = Intent(this, five::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        e3.setOnClickListener {
            val intent = Intent(this, five::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        e2.setOnClickListener {
            val intent = Intent(this, five::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        e1.setOnClickListener {
            val intent = Intent(this, five::class.java)
            intent.putExtra("jumeng", nrand +1)
            startActivity(intent)
        }
    }
}