package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

//作成者：綾部

class signupOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup1)

        //新規登録画面1ボタン
        val btnnext :Button =findViewById(R.id.nextButton)

        //新規登録画面2に遷移
        btnnext.setOnClickListener {
            val intent = Intent(this,signupTwo::class.java)
            startActivity(intent)
        }

        //戻るボタン
        val backButton :ImageView =findViewById(R.id.backButton)

        //ホーム画面に遷移
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