package com.example.gdsc6

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gdsc6.databinding.MainPage2Binding
import com.example.gdsc6.databinding.MainPageBinding

class mainPage2 : AppCompatActivity() {
    private var mBinding: MainPage2Binding? = null
    private val binding get() = mBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MainPage2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        var pass = binding.password.toString()
        var passco = binding.passwordcon.toString()



        if(pass != passco){
            Toast.makeText(this,"비밀먼호가 다릅니다 확인해주세요!",Toast.LENGTH_SHORT).show()
        }



    }
}