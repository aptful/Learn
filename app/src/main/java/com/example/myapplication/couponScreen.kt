package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

//作成者：綾部

class couponScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mycoupon)

        //ホームボタン
        val homeButton : ImageView =findViewById(R.id.homeButton)

        //マイページ画面遷移
        homeButton.setOnClickListener {
            val intent = Intent(this,mypageScreen::class.java)
            startActivity(intent)
        }

        //クーポン利用
        val useBotton : Button = findViewById(R.id.useButton)

        useBotton.setOnClickListener {
            val coupon : TextView = findViewById(R.id.couponText)
            coupon.setVisibility(View.GONE)

        }

        val useBotton1 : Button = findViewById(R.id.useButton1)

        useBotton1.setOnClickListener {
            val coupon1 : TextView = findViewById(R.id.couponText1)
            coupon1.setVisibility(View.GONE)

        }

//        //新規登録画面2ボタン
//        val btnnext : Button =findViewById(R.id.nextButton)
//
//        //新規登録画面3に遷移
//        btnnext.setOnClickListener {
//            val intent = Intent(this,::class.java)
//            startActivity(intent)
//        }

    }
}