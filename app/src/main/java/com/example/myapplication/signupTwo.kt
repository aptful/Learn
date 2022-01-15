package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView

//作成者：綾部

class signupTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup2)

        //【追加】ボタン

        //新規登録画面2ボタン
        val btnnext : Button = findViewById(R.id.nextButton)

        //新規登録画面3に遷移
        btnnext.setOnClickListener {
            val intent = Intent(this, signupThree::class.java)
            startActivity(intent)
        }

        //戻るボタン
        val nextButton : ImageView = findViewById(R.id.backButton)

        //新規登録画面1に遷移
        nextButton.setOnClickListener {
            val intent = Intent(this,signupOne::class.java)
            startActivity(intent)
        }

        //キャンセルボタン
        val cancelButton : Button = findViewById(R.id.cancelButton)

        //ログイン画面に遷移
        cancelButton.setOnClickListener {
            val intent = Intent(this,loginScreen::class.java)
            startActivity(intent)
        }
    }
}