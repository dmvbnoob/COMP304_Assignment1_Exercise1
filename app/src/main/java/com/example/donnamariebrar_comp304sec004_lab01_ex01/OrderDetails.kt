package com.example.donnamariebrar_comp304sec004_lab01_ex01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class OrderDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_details)

        val textCustDet = findViewById<TextView>(R.id.textCustDet)
        val editTextProd = findViewById<EditText>(R.id.editTextProd)
        val editTextPrice = findViewById<EditText>(R.id.editTextPrice)
        val editTextQty = findViewById<EditText>(R.id.editTextQty)
        val btnCalc = findViewById<Button>(R.id.btnCalc)

        val name = intent.getStringExtra("NAME")
        val email = intent.getStringExtra("EMAIL")
        val address = intent.getStringExtra("ADDRESS")
        val custDet = "Customer Name: $name \nEmail: $email \nAddress: $address"
        textCustDet.text = custDet

        btnCalc.setOnClickListener()
        {
            val price = editTextPrice.text.toString().toDoubleOrNull()
            val qty = editTextQty.text.toString().toIntOrNull()

            if (price == null || price <= 0)
            {
                Toast.makeText(this, "Please enter a valid price", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (qty == null || qty < 1 || qty > 10)
            {
                Toast.makeText(this, "Please enter a quantity between 1 and 10", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val total = price * qty

            textCustDet.text = "Your total is: $total \n-------- \n$custDet "
            Toast.makeText(this, "Your total is: $total \n-------- \n$custDet ", Toast.LENGTH_SHORT).show()
        }

    }
}