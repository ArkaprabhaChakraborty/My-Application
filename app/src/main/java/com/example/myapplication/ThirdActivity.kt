package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        btnSearch1.setOnClickListener {
            val message: String = txtNumFact1.text.toString()
            val intent = Intent(this, DisplayThird::class.java)
            intent.putExtra("user_message", message)
            startActivity(intent)
        }
    }
}