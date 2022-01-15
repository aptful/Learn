package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

//作成者：綾部

class newsCouponScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.newscouponscreen)

        //ホームボタン
        val homeButton: ImageView = findViewById(R.id.homeButton)

        //マイページ画面遷移
        homeButton.setOnClickListener {
            val intent = Intent(this, mypageScreen::class.java)
            startActivity(intent)
        }

        //一覧お知らせボタン
        val listButton: TextView = findViewById(R.id.allButton)

        //お知らせ一覧画面に遷移
        listButton.setOnClickListener {
            val intent = Intent(this, newsListScreen::class.java)
            startActivity(intent)
        }

        //キーワードお知らせボタン
        val keywordButton: TextView = findViewById(R.id.keywordButton)

        //キーワードお知らせ一覧画面に遷移
        keywordButton.setOnClickListener {
            val intent = Intent(this, newsKeywordScreen::class.java)
            startActivity(intent)
        }

    }
}