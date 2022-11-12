package com.example.gdsc6

import android.content.Intent
import android.media.RingtoneManager
import android.os.Bundle
import android.os.Handler
import android.os.HandlerThread
import android.os.Message
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.concurrent.thread

class page3 : AppCompatActivity() {

    var total = 0 // 전체 시간을 저장
    var started = false // 시작 되었는지 체크를 위한 변수


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page3)

        val handler = object : Handler() { // Handler 생성
            override fun handleMessage(msg: Message) { // 화면에 시간을 출력하는 Handler
                val minute = String.format("%02d", total / 60) // 분
                val second = String.format("%02d", total % 60) // 초
            }
        }

        val uriRingtone = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE)
        val ringtone = RingtoneManager.getRingtone(this, uriRingtone)
        ringtone.play()
        started = true // started 값 true로 변경
        total = 0 // total 값 초기화

        thread(start = true) { // 스레드 생성
            while (started) { // started 값이true일 경우 반복
                Thread.sleep(1000) // 1초 지연
                if(started) { // started 값이 true일 경우
                    total += 1 // total값을 1씩 더함
                    handler?.sendEmptyMessage(0) // Handler에 메세지 전달
                    if(total==10){
                        started=false // started 값 false로 변경
                        Toast.makeText(this, "10초 지나면 넘어가는거였습니다~", Toast.LENGTH_SHORT).show()
                        ringtone.stop()
                        val intent = Intent(this, page5::class.java)
                        startActivity(intent)
                    }
                }
            }
        }


    }




}