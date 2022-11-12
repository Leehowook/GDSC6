package com.example.gdsc6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gdsc6.databinding.ActivityMainPage3Binding
import com.example.gdsc6.databinding.MainPage2Binding

class mainPage3 : AppCompatActivity() {
    private var mBinding: ActivityMainPage3Binding? = null
    private var count = 0
    private val binding get() = mBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainPage3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checkBox.isChecked = true
        binding.checkBox2.isChecked = true
        binding.checkBox3.isChecked = true
        binding.checkBox4.isChecked = true
        binding.checkBox5.isChecked = true
        binding.checkBox6.isChecked = true
        binding.checkBox7.isChecked = true
        binding.checkBox8.isChecked = true
        binding.checkBox9.isChecked = true
        binding.checkBox10.isChecked = true
        binding.checkBox11.isChecked = true
        binding.checkBox12.isChecked = true
        binding.checkBox13.isChecked = true
        binding.checkBox14.isChecked = true
        binding.checkBox15.isChecked = true
        binding.checkBox16.isChecked = true
        binding.checkBox17.isChecked = true
        binding.checkBox18.isChecked = true
        binding.checkBox19.isChecked = true
        binding.checkBox20.isChecked = true

        binding.checkBox.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox2.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox3.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox4.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox5.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox6.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox7.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox8.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox9.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox10.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox11.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox12.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox13.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox14.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox15.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox16.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox17.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox18.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox19.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        binding.checkBox20.setOnCheckedChangeListener { buttonview, isChecked -> if(isChecked) { count+=1} else { count-=1 } }
        print(count)
        binding.nextSet.setOnClickListener(){
            if(count == 3){
                val intent = Intent(this, page4::class.java)
                startActivity(intent)
            }
        }




    }


}