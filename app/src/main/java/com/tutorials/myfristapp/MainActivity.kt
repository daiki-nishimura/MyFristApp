package com.tutorials.myfristapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            //まーじ
            //マージ後のコミット
        val btnClickMe = findViewById<Button>(R.id.mybutton)
        btnClickMe.setOnClickListener{
            btnClickMe.text = "HAHA you clicked me!"
        }

    }
}