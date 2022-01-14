package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView

//作成者：綾部，井口

class signupThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup3)


        //完了ボタン
        val btnOK : Button =findViewById(R.id.btnOK)

        //マイページ画面に遷移
        btnOK.setOnClickListener {
            val intent = Intent(this,mypageScreen::class.java)
            val checkBox = findViewById<CheckBox>(R.id.checkbox)    //チェックボックス
            if(checkBox.isChecked == true) {
                startActivity(intent)
            }
        }

        //戻るボタン
        val backButton : ImageView =findViewById(R.id.backButton)

        //新規登録画面2に遷移
        backButton.setOnClickListener {
            val intent = Intent(this,loginScreen::class.java)
            startActivity(intent)
        }

        //キャンセルボタン
        val cancelButton : Button =findViewById(R.id.cancelButton)

        //ホーム画面に遷移
        cancelButton.setOnClickListener {
            val intent = Intent(this,loginScreen::class.java)
            startActivity(intent)
        }

    }
}