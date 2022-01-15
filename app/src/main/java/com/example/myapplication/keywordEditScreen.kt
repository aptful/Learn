package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

//作成者：綾部

class keywordEditScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.keywordeditscreen)

        //完了ボタン
        val completeButton : Button = findViewById(R.id.completebutton)

        //キーワード一覧画面に遷移
        completeButton.setOnClickListener {
            val intent = Intent(this,keywordListScreen::class.java)
            startActivity(intent)
        }

        //戻るボタン
        val backButton : ImageView = findViewById(R.id.backButton)

        //キーワード一覧画面に遷移
        backButton.setOnClickListener {
            val intent = Intent(this,keywordListScreen::class.java)
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