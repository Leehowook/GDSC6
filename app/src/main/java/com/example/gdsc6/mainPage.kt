package com.example.gdsc6

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gdsc6.databinding.MainPageBinding


class mainPage : AppCompatActivity() {
    private var mBinding: MainPageBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MainPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.signup.setOnClickListener {
            val intent = Intent(this, mainPage2::class.java)
            startActivity(intent)

        }
        binding.button.setOnClickListener{
            val loginid = binding.editTextTextEmailAddress.text.toString()
            val loginpassward = binding.editTextTextPassword.text.toString()

            val id = MyApplication.prefs.getString("id","")
            val password = MyApplication.prefs.getString("pw","")
            if(loginid==id && loginpassward==password){
                val intent2 = Intent(this, page5::class.java)
                startActivity(intent2)
            }
        }



    }

}