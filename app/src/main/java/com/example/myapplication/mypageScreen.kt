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
        val btnmegaphone : ImageButton =findViewById(R.id.megaphoneImage)
        //歯車ボタン
        val btnconfig : ImageButton =findViewById(R.id.configImage)
        //虫眼鏡ボタン
        val btnsearch : ImageButton =findViewById(R.id.searchImage)
        //しょっぷボタン
        val btnshop : ImageButton =findViewById(R.id.shopView)
        //くーぽんボタン
        val btncoupon: ImageButton =findViewById(R.id.couponView)
        //キーワードボタン
        val btnkeyword: ImageButton =findViewById(R.id.keywordView)
//        //公式サイトボタン
//        val btnofficial: ImageButton =findViewById(R.id.official)
//        //情報提供ボタン
//        val btninfo: ImageButton =findViewById(R.id.info)
//        //ツイッターボタン
//        val btntwitter: ImageButton =findViewById(R.id.twitter)
//        //インスタボタン
//        val btninstagram: ImageButton =findViewById(R.id.instagram)

        //お知らせ一覧画面に遷移
        btnmegaphone.setOnClickListener {
            val intent = Intent(this,newsListScreen::class.java)
            startActivity(intent)
        }

        //設定画面に遷移
        btnconfig.setOnClickListener {
            val intent = Intent(this,configScreen::class.java)
            startActivity(intent)
        }

        //検索画面に遷移
        btnsearch.setOnClickListener {
            val intent = Intent(this,searchScreen::class.java)
            startActivity(intent)
        }

        //お気に入りのお店一覧画面に遷移
        btnshop.setOnClickListener {
            val intent = Intent(this,favShopScreen::class.java)
            startActivity(intent)
        }

        //クーポン一覧画面に遷移
        btncoupon.setOnClickListener {
            val intent = Intent(this,couponScreen::class.java)
            startActivity(intent)
        }

        //お気に入りのキーワード一覧画面に遷移
        btnkeyword.setOnClickListener {
            val intent = Intent(this,keywordListScreen::class.java)
            startActivity(intent)
        }

//        //公式サイトに遷移
//        btnofficial.setOnClickListener {
//            val  uri = "https://www.kutv.co.jp/colorful/"
//            val intent = Intent(this,uri::class.java)
//            startActivity(intent);
//
////                val url = "https://www.kutv.co.jp/colorful/"
////                val karaful = Uri.parse(url)
////                val intent = Intent(this,karaful::class.java)
////                startActivity(intent)
//
////            val urlStr = "https://www.kutv.co.jp/colorful/"
////            it.data = Uri.parse(urlStr)
////            val intent = Intent(this,extension3::class.java)
////            startActivity(intent)
//        }
    }

}