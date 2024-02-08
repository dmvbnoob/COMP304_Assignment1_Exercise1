package com.example.donnamariebrar_comp304sec004_lab01_ex01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class CustomerDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_details)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val editTextName = findViewById<EditText>(R.id.editTextName)
        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val editTextAddress = findViewById<EditText>(R.id.editTextAddress)

        btnLogin.setOnClickListener()
        {
            intent = Intent(this, OrderDetails::class.java)
            intent.putExtra("NAME", editTextName.text.toString())
            intent.putExtra("EMAIL", editTextEmail.text.toString())
            intent.putExtra("ADDRESS", editTextAddress.text.toString())
            startActivity(intent)
        }


    }
}