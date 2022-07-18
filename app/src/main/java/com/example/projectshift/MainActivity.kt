package com.example.projectshift

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.projectshift.databinding.ComeInAccountBinding
import com.example.projectshift.databinding.OpenedActivityBinding
import kotlinx.android.synthetic.main.opened_activity.*





class MainActivity : AppCompatActivity() {
    private lateinit var binding: ComeInAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ComeInAccountBinding.inflate(layoutInflater)
        setContentView(R.layout.come_in_account)

        val imageslider = findViewById<ImageSlider>(R.id.slider)
        var imageList = ArrayList<SlideModel>()

        val buttonidSignIn = findViewById<Button>(R.id.signIn)
        val buttonIdRegister = findViewById<Button>(R.id.register)

        buttonidSignIn.setOnClickListener {
            val activSignIn = Intent(this, SignInActivity::class.java)
            startActivity(activSignIn)
        }

        buttonIdRegister.setOnClickListener {
            val activRegister = Intent(this, RegisterActivity::class.java)
            startActivity(activRegister)
        }

        imageList.add(SlideModel("https://i.ibb.co/V2RvJ21/active1.jpg"))
        imageList.add(SlideModel("https://i.ibb.co/qMnHDg4/Group-28.jpg"))
        imageList.add(SlideModel("https://i.ibb.co/cLqVBHz/Group-29.jpg"))
        imageslider.setImageList(imageList, ScaleTypes.CENTER_INSIDE)








    }
}