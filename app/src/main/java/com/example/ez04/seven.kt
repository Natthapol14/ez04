package com.example.ez04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class seven : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seven)

        val d1: Button = findViewById(R.id.d1)
        val d2: Button = findViewById(R.id.d2)
        val d3: Button = findViewById(R.id.d3)
        val d4: Button = findViewById(R.id.d4)

        val receivedIntent = intent
        val nrand = receivedIntent.getIntExtra("jumeng", 0)


        d4.setOnClickListener {
            val intent = Intent(this, eight::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        d3.setOnClickListener {
            val intent = Intent(this, eight::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        d2.setOnClickListener {
            val intent = Intent(this, eight::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        d1.setOnClickListener {
            val intent = Intent(this, eight::class.java)
            intent.putExtra("jumeng", nrand +1)
            startActivity(intent)
        }
    }
}