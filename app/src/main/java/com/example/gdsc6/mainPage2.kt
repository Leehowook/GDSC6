package com.example.gdsc6

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.text.Editable
import android.text.TextWatcher
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

        binding.passwordcon.addTextChangedListener(object : TextWatcher {
            // EditText에 문자 입력 전
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            // EditText에 변화가 있을 경우
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            // EditText 입력이 끝난 후
            override fun afterTextChanged(p0: Editable?) {
                if(binding.password.getText().toString().equals(binding.passwordcon.getText().toString())){
                    binding.eq.setText("일치합니다.")
                }
                else
                    binding.eq.setText("일치하지 않습니다.")
            }
        })
        binding.next.setOnClickListener(){
            if(binding.password.getText().toString().equals(binding.passwordcon.getText().toString())){
                val id = binding.editTextTextEmailAddress3.text.toString()
                val pw = binding.password.text.toString()

                MyApplication.prefs.setString("id", id)
                MyApplication.prefs.setString("pw", pw)

                val intent = Intent(this, page2::class.java)
                startActivity(intent)
            }
        }


    }
}