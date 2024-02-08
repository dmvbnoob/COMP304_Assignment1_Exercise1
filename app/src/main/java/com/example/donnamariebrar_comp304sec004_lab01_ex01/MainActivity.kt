package com.example.donnamariebrar_comp304sec004_lab01_ex01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnProceed = findViewById<Button>(R.id.btnProceed)

        btnProceed.setOnClickListener()
        {
            intent = Intent(this, CustomerDetails::class.java)
            startActivity(intent)
        }


    }

}