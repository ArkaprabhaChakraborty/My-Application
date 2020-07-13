package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_fifth.*


class FifthActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)
        btnSearch3.setOnClickListener {
            val message: String = txtNumFact3.text.toString()
            val intent = Intent(this, DisplaySecond::class.java)
            intent.putExtra("user_message", message)
            startActivity(intent)
        }
    }
}