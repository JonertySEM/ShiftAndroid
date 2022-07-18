package com.example.projectshift


import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.opened_activity.*
import kotlinx.android.synthetic.main.register_account.*

class RegisterActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_account)

        val tstStr = "Пароль должен содержать от 6 до 20 символов," +
                " минимум 1 большую букву, одну маленькую букву и либо специальный символ, либо цифру"

        button_regist.setOnClickListener {

            val validPass = Regex("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9@#\$%]).{6,20}").find(password_Reg.text.toString())
            if(validPass == null){
                Toast.makeText(applicationContext,tstStr, Toast.LENGTH_SHORT).show()
            }
            else{
                val goInNewActiv = Intent(this, MainActivity::class.java)
                startActivity(goInNewActiv)
                Toast.makeText(applicationContext, "Регистрация прошла успешно", Toast.LENGTH_SHORT).show()
            }

        }


    }
}

