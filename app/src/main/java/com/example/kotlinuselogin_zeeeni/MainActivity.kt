package com.example.kotlinuselogin_zeeeni

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        아이디 입력값, 비번 입력값을 각각의 변수에 저장
        loginBtn.setOnClickListener {

            val inputId = idEdt.text.toString()
            val inputPw = passwordEdt.text.toString()

//            두개의 변수에 들어있는 값 검사.(맞는 아이디/비번)
//            맞을 때 => 틀릴 때 분기처리 (if 문 활용)

            if (inputId == "admin@test.com" && inputPw == "qwer") {

                Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()

            }
            else{
                Toast.makeText(this, "로그인실패", Toast.LENGTH_SHORT).show()
            }

        }

    }
}