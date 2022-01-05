package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

//作成者：綾部

class loginScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //画面生成
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        //ボタンの作成
        //ログインボタン
        val btnlogin :Button =findViewById(R.id.loginButton)
        //新規登録画面ボタン
        val btnSignup :Button =findViewById(R.id.createButton)

        //ボタンを押したら次の画面へ
        //ログイン画面に遷移
        btnlogin.setOnClickListener {
            val intent = Intent(this,mypageScreen::class.java)
            startActivity(intent)
        }

        //新規登録画面1に遷移
        btnSignup.setOnClickListener {
            val intent = Intent(this,signupOne::class.java)
            startActivity(intent)
        }
    }
}