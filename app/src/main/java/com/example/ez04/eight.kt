package com.example.ez04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class eight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eight)

        val f1: Button = findViewById(R.id.f1)
        val f2: Button = findViewById(R.id.f2)
        val f3: Button = findViewById(R.id.f3)
        val f4: Button = findViewById(R.id.f4)

        val receivedIntent = intent
        val nrand = receivedIntent.getIntExtra("jumeng", 0)


        f4.setOnClickListener {
            val intent = Intent(this, nine::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        f3.setOnClickListener {
            val intent = Intent(this, nine::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        f2.setOnClickListener {
            val intent = Intent(this, nine::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        f1.setOnClickListener {
            val intent = Intent(this, nine::class.java)
            intent.putExtra("jumeng", nrand +1)
            startActivity(intent)
        }
    }
}