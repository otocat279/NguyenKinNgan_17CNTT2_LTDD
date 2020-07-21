package com.example.ex1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Activity2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)
    }
}