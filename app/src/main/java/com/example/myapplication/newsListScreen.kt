package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

//作成者：綾部

class newsListScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.newslistscreen)

        //ホームボタン
        val homeButton : ImageView =findViewById(R.id.homeButton)

        //マイページ画面遷移
        homeButton.setOnClickListener {
            val intent = Intent(this,mypageScreen::class.java)
            startActivity(intent)
        }

        //クーポンお知らせボタン
        val btncoupon : TextView =findViewById(R.id.couponButton)

        //クーポンお知らせ一覧画面に遷移
        btncoupon.setOnClickListener {
            val intent = Intent(this,newsCouponScreen::class.java)
            startActivity(intent)
        }

        //キーワードお知らせボタン
        val btnkeyword : TextView =findViewById(R.id.keywordButton)

        //キーワードお知らせ一覧画面に遷移
         btnkeyword.setOnClickListener {
            val intent = Intent(this,newsKeywordScreen::class.java)
            startActivity(intent)
        }

    }
}