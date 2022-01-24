package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class detailShopScreenFour : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailshopscreen4)

        //ホームボタン
        val homeButton: ImageView = findViewById(R.id.homeButton)

        //マイページ画面遷移
        homeButton.setOnClickListener {
            val intent = Intent(this, mypageScreen::class.java)
            startActivity(intent)
        }

//        //戻るボタン
//        val backButton : ImageView = findViewById(R.id.backButton)
//
//        //設定画面に遷移
//        backButton.setOnClickListener {
//            val intent = Intent(this,configScreen::class.java)
//            startActivity(intent)
//        }

        //ハートボタンの生成
        val heartLineButton: ImageButton = findViewById(R.id.heartLineButton)
        val heartButton: ImageButton = findViewById(R.id.heartButton)


        //白抜きハートボタンの動き
        heartLineButton.setOnClickListener {
            heartLineButton.visibility = View.INVISIBLE
            heartButton.visibility = View.VISIBLE
        }
        //塗りつぶしハートボタンの動き
        heartButton.setOnClickListener {
            heartButton.visibility = View.INVISIBLE
            heartLineButton.visibility = View.VISIBLE
        }
    }
}