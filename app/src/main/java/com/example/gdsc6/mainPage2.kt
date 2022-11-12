package com.example.gdsc6

import android.os.Bundle
import android.os.PersistableBundle
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

        if()



    }
}