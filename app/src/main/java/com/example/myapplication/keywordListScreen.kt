package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

//作成者：綾部

class keywordListScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.keywordAll)

        //編集ボタン
        val setButton : Button =findViewById(R.id.setButton)

        //キーワード編集画面に遷移
        setButton.setOnClickListener {
            val intent = Intent(this,keywordEditScreen::class.java)
            startActivity(intent)
        }

        //ホームボタン
        val homeButton : ImageView =findViewById(R.id.homeButton)

        //マイページ画面遷移
        homeButton.setOnClickListener {
            val intent = Intent(this,mypageScreen::class.java)
            startActivity(intent)
        }

        //キーワードボタン
        val takeoutButton : Button =findViewById(R.id.takeoutButton)

        //キーワード該当するお店一覧画面に遷移
        takeoutButton.setOnClickListener {
            val intent = Intent(this,keywordShopScreen::class.java)
            startActivity(intent)
        }

    }
}