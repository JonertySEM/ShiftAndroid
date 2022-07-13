package com.example.projectshift

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class SplashActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.come_in_account)

        val newActiv = Intent(this, MainActivity::class.java)
        startActivity(newActiv)
        finish()

    }
}