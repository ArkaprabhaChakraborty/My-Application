package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btnSearch.setOnClickListener {
            val message: String = txtNumFact.text.toString()
            val intent = Intent(this, DisplaySecond::class.java)
            intent.putExtra("user_message", message)
            startActivity(intent)
        }
    }
}