package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

//作成者：綾部

class searchScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search)

        //キーワードボタン
        val  btntakeout: Button =findViewById(R.id.takeoutButton)

        //キーワードに該当するお店一覧画面遷移
        btntakeout.setOnClickListener {
            val intent = Intent(this,keywordShopScreen::class.java)
            startActivity(intent)
        }

        //ホームボタン
        val homeButton : ImageView =findViewById(R.id.homeButton)

        //マイページ画面遷移
        homeButton.setOnClickListener {
            val intent = Intent(this,mypageScreen::class.java)
            startActivity(intent)
        }

    }
}