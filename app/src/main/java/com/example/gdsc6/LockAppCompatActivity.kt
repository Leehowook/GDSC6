package com.example.gdsc6

import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
open class LockAppCompatActivity : AppCompatActivity()
{
    override fun onBackPressed() {
        Toast.makeText(this, "뒤로가기 금지!", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        val activityManager: ActivityManager = applicationContext.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        activityManager.moveTaskToFront(taskId,0)
        Toast.makeText(this,"목록버튼 금지!", Toast.LENGTH_SHORT).show()
    }

    override fun onUserLeaveHint() {
        Toast.makeText(this,"어디가", Toast.LENGTH_SHORT).show()
        finish()

        var i = Intent(this, mainPage::class.java)
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(i)
        super.onUserLeaveHint()
    }
}