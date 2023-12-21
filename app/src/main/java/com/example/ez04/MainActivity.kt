package com.example.ez04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rpg: Button = findViewById(R.id.rpg)
        val open: Button = findViewById(R.id.rpg)
        val moba: Button = findViewById(R.id.moba)
        val fps: Button = findViewById(R.id.fps)




        var numrand: Int = 0

        val receivedIntent = intent



        moba.setOnClickListener {
            val intent = Intent(this, sercond::class.java)
            intent.putExtra("jumeng", numrand )
            startActivity(intent)
        }
        fps.setOnClickListener {
            val intent = Intent(this, sercond::class.java)
            intent.putExtra("jumeng", numrand )
            startActivity(intent)
        }
        rpg.setOnClickListener {
            val intent = Intent(this, sercond::class.java)
            intent.putExtra("jumeng", numrand +1)

            startActivity(intent)
        }
        open.setOnClickListener {
            val intent = Intent(this, sercond::class.java)
            intent.putExtra("jumeng", numrand +1)

            startActivity(intent)
        }
    }
}