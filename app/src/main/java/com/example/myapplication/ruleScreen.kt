package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

//作成者：綾部

class ruleScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rulescreen)

        //戻るボタン
        val backButton : ImageView = findViewById(R.id.backButton)

        //設定画面に遷移
        backButton.setOnClickListener {
            val intent = Intent(this,configScreen::class.java)
            startActivity(intent)
        }

        //ホームボタン
        val homeButton : ImageView = findViewById(R.id.homeButton)

        //マイページ画面遷移
        homeButton.setOnClickListener {
            val intent = Intent(this,mypageScreen::class.java)
            startActivity(intent)
        }

    }
}