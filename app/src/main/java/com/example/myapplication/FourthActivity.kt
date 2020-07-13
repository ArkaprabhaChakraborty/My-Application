package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_fourth.*


class FourthActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        btnSearch2.setOnClickListener {
            val message: String = txtNumFact2.text.toString()
            val intent = Intent(this, DisplaySecond::class.java)
            intent.putExtra("user_message", message)
            startActivity(intent)
        }
    }
}