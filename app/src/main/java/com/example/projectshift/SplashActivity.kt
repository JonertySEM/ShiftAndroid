package com.example.projectshift

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.HandlerCompat.postDelayed


class SplashActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        val backgroundText:TextView = findViewById(R.id.LogoText)
        val sideAnim = AnimationUtils.loadAnimation(this,R.anim.slide)
        backgroundText.startAnimation(sideAnim)

        Handler().postDelayed({
            val newActiv = Intent(this, MainActivity::class.java)
            startActivity(newActiv)
            finish()

        },3000)


    }
}