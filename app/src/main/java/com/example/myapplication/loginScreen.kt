package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.text.InputFilter
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class loginScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginscreen)

        //ID入力欄
        val textIdEdit = findViewById<EditText>(R.id.userName)
        //パスワード入力欄
        val textPasswordEdit = findViewById<EditText>(R.id.passWord)
        //ログインボタン
        val loginButton: Button = findViewById(R.id.loginButton)
        //新規登録ボタン
        val createButton: Button = findViewById(R.id.createButton)


        //マイページに遷移
        loginButton.setOnClickListener {
            val intent = Intent(this, mypageScreen::class.java)
            if (textIdEdit.length() == 5 && textPasswordEdit.length() >= 6) {
                startActivity(intent)
            }
        }

        //新規登録画面1に遷移
        createButton.setOnClickListener {
            val intent = Intent(this, signupOne::class.java)
            startActivity(intent)
        }
    }
}