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
        setContentView(R.layout.keywordall)

        //編集ボタン
        val setButton : Button =findViewById(R.id.setButton)

        //キーワード編集画面に遷移
        setButton.setOnClickListener {
            val intent = Intent(this,keywordEditScreen::class.java)
            startActivity(intent)
        }

        //ホームボタン
        val homeButton : ImageView = findViewById(R.id.homeButton)

        //マイページ画面遷移
        homeButton.setOnClickListener {
            val intent = Intent(this,mypageScreen::class.java)
            startActivity(intent)
        }

        //キーワードのボタンの実装
        //テイクアウトボタン
        val  takeoutButton: Button = findViewById(R.id.takeoutButton)

        //キーワードに該当するお店一覧画面遷移
        takeoutButton.setOnClickListener {
            val intent = Intent(this,keywordShopScreen::class.java)
            startActivity(intent)
        }

        //スイーツボタン
        val  sweetsButton: Button = findViewById(R.id.sweetsButton)

        //キーワードに該当するお店一覧画面遷移
        sweetsButton.setOnClickListener {
            val intent = Intent(this,keywordShopScreen::class.java)
            startActivity(intent)
        }

        //ドリンクボタン
        val  drinkButton: Button = findViewById(R.id.drinkButton)

        //キーワードに該当するお店一覧画面遷移
        drinkButton.setOnClickListener {
            val intent = Intent(this,keywordShopScreen::class.java)
            startActivity(intent)
        }

        //カフェボタン
        val  cafeButton: Button = findViewById(R.id.cafeButton)

        //キーワードに該当するお店一覧画面遷移
        cafeButton.setOnClickListener {
            val intent = Intent(this,keywordShopScreen::class.java)
            startActivity(intent)
        }


        //手土産ボタン
        val  temiyageButton: Button = findViewById(R.id.temiyageButton)

        //キーワードに該当するお店一覧画面遷移
        temiyageButton.setOnClickListener {
            val intent = Intent(this,keywordShopScreen::class.java)
            startActivity(intent)
        }

        //居酒屋ボタン
        val  izakayaButton: Button = findViewById(R.id.izakayaButton)

        //キーワードに該当するお店一覧画面遷移
        izakayaButton.setOnClickListener {
            val intent = Intent(this,keywordShopScreen::class.java)
            startActivity(intent)
        }

    }
}