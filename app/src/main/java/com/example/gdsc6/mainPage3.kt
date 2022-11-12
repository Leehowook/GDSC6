package com.example.gdsc6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.Toast
import com.example.gdsc6.databinding.ActivityMainPage3Binding
import com.example.gdsc6.databinding.MainPage2Binding

class mainPage3 : AppCompatActivity() {
    private var mBinding: ActivityMainPage3Binding? = null

    private val binding get() = mBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainPage3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        var count = 0

        binding.butt02.setOnClickListener{
            if(!binding.checkBox.isChecked){
                count++
            }
            if(!binding.checkBox2.isChecked){
                count++
            }
            if(!binding.checkBox3.isChecked){
                count++
            }
            if(!binding.checkBox4.isChecked){
                count++
            }
            if(!binding.checkBox5.isChecked){
                count++
            }
            if(!binding.checkBox6.isChecked){
                count++
            }
            if(!binding.checkBox7.isChecked){
                count++
            }
            if(!binding.checkBox8.isChecked){
                count++
            }
            if(!binding.checkBox9.isChecked){
                count++
            }
            if(!binding.checkBox10.isChecked){
                count++
            }
            if(!binding.checkBox11.isChecked){
                count++
            }
            if(!binding.checkBox12.isChecked){
                count++
            }
            if(!binding.checkBox13.isChecked){
                count++
            }
            if(!binding.checkBox14.isChecked){
                count++
            }
            if(!binding.checkBox15.isChecked){
                count++
            }
            if(!binding.checkBox16.isChecked){
                count++
            }
            if(!binding.checkBox17.isChecked){
                count++
            }
            if(!binding.checkBox18.isChecked){
                count++
            }
            if(!binding.checkBox19.isChecked){
                count++
            }
            if(!binding.checkBox20.isChecked){
                count++
            }
            if(count == 17){
                val intent = Intent(this, page4::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"3개를 선택해주세요",Toast.LENGTH_SHORT).show()
            }

            count = 0



        }


    }
}