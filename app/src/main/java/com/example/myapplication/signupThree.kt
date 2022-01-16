package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.CheckBox

//作成者：綾部，井口

class signupThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup3)
//        val pass :TextView = findViewById(R.id.password_edit_signupText)

//        val editpass = intent.getStringExtra("pass")    //値の受け取り
//        pass.text = editpass    //テキストに表示
        //完了ボタン
        val completeButton : Button = findViewById(R.id.okButton)

        //ログイン画面に遷移
        completeButton.setOnClickListener {

            val checkBox = findViewById<CheckBox>(R.id.checkbox)    //チェックボックス
            while(checkBox.isChecked) {
                val intent = Intent(this, loginScreen::class.java)
                startActivity(intent)
            }
        }

        //戻るボタン
        val backButton : ImageView = findViewById(R.id.backButton)

        //新規登録画面2に遷移
        backButton.setOnClickListener {
            val intent = Intent(this,signupTwo::class.java)
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