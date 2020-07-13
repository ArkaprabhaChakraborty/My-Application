package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMath.setOnClickListener()
        {
            val intent = Intent(this , SecondActivity::class.java)
            startActivity(intent)
        }
        btnYear.setOnClickListener()
        {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
        btnDate.setOnClickListener ()
        {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }
        btnTrivia.setOnClickListener ()
        {
            val intent = Intent(this,FifthActivity::class.java)
            startActivity(intent)
        }
    }
}