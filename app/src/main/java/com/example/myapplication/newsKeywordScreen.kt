package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Button

//作成者：綾部

class newsKeywordScreen<Bottom> : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.newskeywordscreen)

        //ホームボタン
        val homeButton: ImageView = findViewById(R.id.homeButton)

        //マイページ画面遷移
        homeButton.setOnClickListener {
            val intent = Intent(this, mypageScreen::class.java)
            startActivity(intent)
        }

        //一覧お知らせボタン
        val btnlist: TextView = findViewById(R.id.allButton)

        //お知らせ一覧画面に遷移
        btnlist.setOnClickListener {
            val intent = Intent(this, newsListScreen::class.java)
            startActivity(intent)
        }


        //クーポンお知らせボタン
        val btncoupon : TextView =findViewById(R.id.couponButton)

        //クーポンお知らせ一覧画面に遷移
        btncoupon.setOnClickListener {
            val intent = Intent(this,newsCouponScreen::class.java)
            startActivity(intent)
        }

        //お店紹介のボタンからお店情報詳細へ
        //一つ目のボタン
        val  contentsText1: Button =findViewById(R.id.contentsText1)

        //キーワードに該当するお店一覧画面遷移
        contentsText1.setOnClickListener {
            val intent = Intent(this,detailShopScreen::class.java)
            startActivity(intent)
        }

        //二つ目のボタン
        val  contentsText2: Button =findViewById(R.id.contentsText2)

        //キーワードに該当するお店一覧画面遷移
        contentsText2.setOnClickListener {
            val intent = Intent(this,detailShopScreen::class.java)
            startActivity(intent)
        }

        //三つ目のボタン
        val  contentsText3: Button =findViewById(R.id.contentsText3)

        //キーワードに該当するお店一覧画面遷移
        contentsText3.setOnClickListener {
            val intent = Intent(this,detailShopScreen::class.java)
            startActivity(intent)
        }

        //四つ目のボタン
        val  contentsText4: Button =findViewById(R.id.contentsText4)

        //キーワードに該当するお店一覧画面遷移
        contentsText4.setOnClickListener {
            val intent = Intent(this,detailShopScreen::class.java)
            startActivity(intent)
        }

        //四つ目のボタン
        val  contentsText5: Button =findViewById(R.id.contentsText5)

        //キーワードに該当するお店一覧画面遷移
        contentsText5.setOnClickListener {
            val intent = Intent(this,detailShopScreen::class.java)
            startActivity(intent)
        }
    }
}