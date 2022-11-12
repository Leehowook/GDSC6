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
        var count = 20




        /*val checkArray : Array<CheckBox> = arrayOf(binding.checkBox,binding.checkBox2,binding.checkBox3,
            binding.checkBox4,binding.checkBox5,binding.checkBox6,binding.checkBox7,binding.checkBox8,
            binding.checkBox9,binding.checkBox10,binding.checkBox11,binding.checkBox12,binding.checkBox13,
            binding.checkBox14,binding.checkBox15,binding.checkBox16,binding.checkBox17,binding.checkBox18,
            binding.checkBox19,binding.checkBox20)

        val Listner = CompoundButton.OnCheckedChangeListener{buttonView, isChecked ->
            if(isChild)
            {
                count++
            }
            else{}
        }

        for(i in checkArray)
        {
            i.setOnCheckedChangeListener(Listner)
        }

        binding.nextSet.setOnClickListener(){
            if(count == 3){
                val intent = Intent(this, page4::class.java)
                startActivity(intent)
            }
        }
    }
    private fun checkOnOff(checkBox: CheckBox)
    {
        if(checkBox.isChecked)
        {
            checkBox.isChecked = false
            count++
        }
        else
        {
            checkBox.isChecked = true
        }

        if(count == 17)
        {
            isClear = true
        }*/
    }
}