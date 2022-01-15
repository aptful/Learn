package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

//作成者：綾部

class mypageScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mypage)

        //メガフォンボタン
        val megaphoneButton : ImageButton = findViewById(R.id.megaphoneImage)
        //歯車ボタン
        val configButton : ImageButton = findViewById(R.id.configImage)
        //虫眼鏡ボタン
        val searchButton : ImageButton = findViewById(R.id.searchImage)
        //しょっぷボタン
        val shopButton : ImageButton = findViewById(R.id.shopView)
        //くーぽんボタン
        val couponButton: ImageButton = findViewById(R.id.couponView)
        //キーワードボタン
        val keywordButton: ImageButton = findViewById(R.id.keywordView)
        //公式サイトボタン
        val officialButton: ImageButton = findViewById(R.id.official)
        //情報提供ボタン
        val infoButton: ImageButton = findViewById(R.id.info)
        //ツイッターボタン
        val twitterButton: ImageButton = findViewById(R.id.twitter)
        //インスタボタン
        val instagramButton: ImageButton = findViewById(R.id.instagram)

        //お知らせ一覧画面に遷移
        megaphoneButton.setOnClickListener {
            val intent = Intent(this,newsListScreen::class.java)
            startActivity(intent)
        }

        //設定画面に遷移
        configButton.setOnClickListener {
            val intent = Intent(this,configScreen::class.java)
            startActivity(intent)
        }

        //検索画面に遷移
        searchButton.setOnClickListener {
            val intent = Intent(this,searchScreen::class.java)
            startActivity(intent)
        }

        //お気に入りのお店一覧画面に遷移
        shopButton.setOnClickListener {
            val intent = Intent(this,favShopScreen::class.java)
            startActivity(intent)
        }

        //クーポン一覧画面に遷移
        couponButton.setOnClickListener {
            val intent = Intent(this,couponScreen::class.java)
            startActivity(intent)
        }

        //お気に入りのキーワード一覧画面に遷移
        keywordButton.setOnClickListener {
            val intent = Intent(this,keywordListScreen::class.java)
            startActivity(intent)
        }

        //公式サイトに遷移
        officialButton.setOnClickListener {
            val uri = Uri.parse("https://www.kutv.co.jp/colorful/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        //情報提供フォームに遷移
        infoButton.setOnClickListener {
            val uri = Uri.parse("https://www.kutv.co.jp/colorfulform/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        //Twitterに遷移
        twitterButton.setOnClickListener {
            val uri = Uri.parse("https://twitter.com/kutv_colorful")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        //Instagramに遷移
        instagramButton.setOnClickListener {
            val uri = Uri.parse("https://www.instagram.com/kutv_colorful/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }

}