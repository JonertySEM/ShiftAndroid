package com.example.projectshift

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.projectshift.databinding.OpenedActivityBinding
import kotlinx.android.synthetic.main.opened_activity.*
import kotlinx.android.synthetic.main.opened_activity.password_sign
import kotlinx.android.synthetic.main.register_account.*
import kotlinx.android.synthetic.main.splash_screen.view.*
import kotlinx.android.synthetic.main.uslug_activity.*

private lateinit var bindSignIn: OpenedActivityBinding

class SignInActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindSignIn = OpenedActivityBinding.inflate(layoutInflater)
        setContentView(R.layout.opened_activity)


        button_signIn.setOnClickListener {
            val strPas = password_sign.text.toString()
            val strLog = name_sign.text.toString()
            if(strLog == "Алимпиев Семён Игоревич" && strPas == "TeST147"){
                val goInNewActiv = Intent(this, LineAcitvity::class.java)
                startActivity(goInNewActiv)
                Toast.makeText(applicationContext, "Добро пожаловать, Семён", Toast.LENGTH_SHORT).show()

            }
            else Toast.makeText(applicationContext, "Данные введены неправильно", Toast.LENGTH_SHORT).show()

        }




    }
}