package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

//作成者：綾部

class newsKeywordScreen : AppCompatActivity() {
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

    }
}