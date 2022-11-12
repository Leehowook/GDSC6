package com.example.gdsc6

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.KeyEvent
import android.view.WindowManager
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.LinearLayoutCompat


@Suppress("DEPRECATION")
class page2 : LockAppCompatActivity()
{
    var numberOfClick = arrayOf<Int>(0,0,0,0)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page2)

        val button : Array<ImageButton> = arrayOf(findViewById(R.id.Youtube), findViewById(R.id.us),
            findViewById(R.id.Play_stores), findViewById(R.id.chrome))
        val textButton : Array<TextView> = arrayOf(findViewById(R.id.youtubeText), findViewById(R.id.EXITText),
            findViewById(R.id.playText), findViewById(R.id.chromeText))

        for(i in 0 until button.size)
        {
            button[i].setOnClickListener {changeIMG(button[i], textButton[i] ,i)}
        }
    }

    private fun changeIMG(button : ImageButton, text : TextView, n : Int)
    {
        button.setBackgroundColor(0)
        button.setImageResource(R.drawable.us)
        text.text = "EXIT"
        text.textSize = 10.0f
        numberOfClick[n]++

        if(numberOfClick[n] > 3)
        {
            button.scaleX *= 2
            button.scaleY *= 2

            if(numberOfClick[n] > 15)
            {
                if(numberOfClick[n] % 5 == 0)
                    Toast.makeText(this, "Too Loud!!!!", Toast.LENGTH_SHORT).show()
            }
            else if(numberOfClick[n] > 8)
            {
                if(numberOfClick[n] % 5 == 3)
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        return when(keyCode)
        {
            KeyEvent.KEYCODE_VOLUME_DOWN->
            {
                val intent = Intent(this, page4::class.java)
                startActivity(intent)
                return true
            }
            else -> return super.onKeyDown(keyCode, event)
        }
    }
}