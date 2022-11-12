package com.example.gdsc6

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gdsc6.databinding.Page4Binding

class page4 : AppCompatActivity() {

    //이거 두줄이랑
    private var mBinding: Page4Binding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //이거 두줄 해야 바인딩됨
        mBinding = Page4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        mBinding!!.page4AgreeBt.setOnClickListener(){
            if (binding.page4Textview.getText().toString()=="991209"){
                val intent = Intent(this, mainPage::class.java)
                startActivity(intent)
            }
        }

    }
}