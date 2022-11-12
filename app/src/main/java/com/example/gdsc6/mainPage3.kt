package com.example.gdsc6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gdsc6.databinding.ActivityMainPage3Binding
import com.example.gdsc6.databinding.MainPage2Binding

class mainPage3 : AppCompatActivity() {
    private var mBinding: ActivityMainPage3Binding = null
    private val binding get() = mBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainPage3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        var count = 0
        binding.checkBox.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }




    }
}