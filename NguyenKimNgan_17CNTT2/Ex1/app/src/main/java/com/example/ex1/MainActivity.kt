package com.example.ex1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnChuyen.setOnClickListener {
            val intent: Intent = Intent(this, Activity2Activity::class.java)
            startActivity(intent)
        }
    }
}