package com.example.ez04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class five : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)

        val a1: Button = findViewById(R.id.a1)
        val a2: Button = findViewById(R.id.a2)
        val a3: Button = findViewById(R.id.a3)
        val a4: Button = findViewById(R.id.a4)

        val receivedIntent = intent
        val nrand = receivedIntent.getIntExtra("jumeng", 0)


        a4.setOnClickListener {
            val intent = Intent(this, six::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        a3.setOnClickListener {
            val intent = Intent(this, six::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        a2.setOnClickListener {
            val intent = Intent(this, six::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        a1.setOnClickListener {
            val intent = Intent(this, six::class.java)
            intent.putExtra("jumeng", nrand +1)
            startActivity(intent)
        }
    }
}

