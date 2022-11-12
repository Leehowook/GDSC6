package com.example.gdsc6

import android.app.Activity
import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


open class LockAppCompatActivity : AppCompatActivity()
{
    var isClear : Boolean = false
    var numToast : Int = 0
    override fun onBackPressed()
    {
        if(numToast % 8 == 0)
        {
            Toast.makeText(this, "어림도 없지", Toast.LENGTH_SHORT).show()
        }
        numToast++
    }

    override fun onPause()
    {
        super.onPause()
        if(!isClear)
        {
            val activityManager: ActivityManager =
                applicationContext.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
            activityManager.moveTaskToFront(taskId, 0)
            if(numToast % 8 == 0)
            {
                Toast.makeText(this, "어어..?", Toast.LENGTH_SHORT).show()
            }
            numToast++
        }
    }

    override fun onUserLeaveHint()
    {
        if(!isClear)
        {
            if(numToast % 8 == 0)
            {
                Toast.makeText(this,"이건 될 줄 알았지?", Toast.LENGTH_SHORT).show()
            }
            val i = intent
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(i)
        }
        numToast++

        super.onUserLeaveHint()
    }
}