package com.example.littlelovev1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class finalscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finalscreen)

        supportActionBar?.hide()
    }
}