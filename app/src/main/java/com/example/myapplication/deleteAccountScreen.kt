package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

//作成者：綾部

class deleteAccountScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.withdrawalshow)

        //ホームボタン
        val homeButton : ImageView =findViewById(R.id.homeButton)

        //マイページ画面遷移
        homeButton.setOnClickListener {
            val intent = Intent(this,mypageScreen::class.java)
            startActivity(intent)
        }
        //退会ボタン
        val btnwithdrawal : Button =findViewById(R.id.withdrawalbutton)

        //設定画面に遷移
        btnwithdrawal.setOnClickListener {
            val intent = Intent(this,configScreen::class.java)
            startActivity(intent)
        }

    }
}