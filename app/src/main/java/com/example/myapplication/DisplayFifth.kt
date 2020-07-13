package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_fifth_display.*
import kotlinx.android.synthetic.main.activity_second_display.*
import okhttp3.*
import java.io.IOException


class DisplayFifth:AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth_display)
        val bundle: Bundle? = intent.extras
        bundle?.let()
        {
            val msg = bundle.getString("user_message")
            if (msg != null) {
                fetchjson(msg)
            }
        }
    }
    fun fetchjson(user_message: String)
    {
        val url = "http://numbersapi.com/$user_message/trivia"
        val client = OkHttpClient()
        val request = Request.Builder().url(url).build()
        var mssge = ""
        val body = client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                println("Failed")
            }

            override fun onResponse(call: Call, response: Response){
                val message = response.body()?.string()
                println(message)
                val mssg = message.toString()
                println(mssg)
                this@DisplayFifth.runOnUiThread(java.lang.Runnable {
                    txvUserMessage3.text = mssg
                })
            }
        })
    }
}