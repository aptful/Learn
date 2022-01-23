package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

//作成者：綾部

class keywordShopScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.keywordshopscreen)

        //戻るボタン
        val backButton : ImageView = findViewById(R.id.backButton)

        //キーワード一覧画面に遷移
        backButton.setOnClickListener {
            val intent = Intent(this,searchScreen::class.java)
            startActivity(intent)
        }

        //ホームボタン
        val homeButton : ImageView = findViewById(R.id.homeButton)

        //マイページ画面遷移
        homeButton.setOnClickListener {
            val intent = Intent(this,mypageScreen::class.java)
            startActivity(intent)
        }

        //ひとつ目のお店ボタン
        val homepic1 : ImageView = findViewById(R.id.homepic1)

        //そのお店の情報詳細画面遷移
        homepic1.setOnClickListener {
            val intent = Intent(this,detailShopScreenOne::class.java)
            startActivity(intent)
        }

        //ふたつ目のお店ボタン
        val homepic2 : ImageView = findViewById(R.id.homepic2)

        //そのお店の情報詳細画面遷移
        homepic2.setOnClickListener {
            val intent = Intent(this,detailShopScreenTwo::class.java)
            startActivity(intent)
        }

        //みっつ目のお店ボタン
        val homepic3 : ImageView = findViewById(R.id.homepic3)

        //そのお店の情報詳細画面遷移
        homepic3.setOnClickListener {
            val intent = Intent(this,detailShopScreenThree::class.java)
            startActivity(intent)
        }

        //よっつ目のお店ボタン
        val homepic4 : ImageView = findViewById(R.id.homepic4)

        //そのお店の情報詳細画面遷移
        homepic4.setOnClickListener {
            val intent = Intent(this,detailShopScreenFour::class.java)
            startActivity(intent)
        }

        //いつつ目のお店ボタン
        val homepic5 : ImageView = findViewById(R.id.homepic5)

        //そのお店の情報詳細画面遷移
        homepic5.setOnClickListener {
            val intent = Intent(this,detailShopScreenFive::class.java)
            startActivity(intent)
        }


    }
}