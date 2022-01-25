package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

//作成者：綾部

class newsListScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.newslistscreen)

        //ホームボタン
        val homeButton : ImageView = findViewById(R.id.homeButton)

        //マイページ画面遷移
        homeButton.setOnClickListener {
            val intent = Intent(this,mypageScreen::class.java)
            startActivity(intent)
        }

        //クーポンお知らせボタン
        val couponButton  : TextView = findViewById(R.id.couponButton)

        //クーポンお知らせ一覧画面に遷移
        couponButton.setOnClickListener {
            val intent = Intent(this,newsCouponScreen::class.java)
            startActivity(intent)
        }

        //キーワードお知らせボタン
        val keywordButton : TextView = findViewById(R.id.keywordButton)

        //キーワードお知らせ一覧画面に遷移
        keywordButton.setOnClickListener {
            val intent = Intent(this,newsKeywordScreen::class.java)
            startActivity(intent)
        }


        //お店紹介のボタンからお店情報詳細へ
        //一つ目のボタン
        val  contentsText: Button = findViewById(R.id.contentsText)

        //キーワードに該当するお店一覧画面遷移
        contentsText.setOnClickListener {
            val intent = Intent(this,detailShopScreenThree::class.java)
            startActivity(intent)
        }

    }
}