package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

//作成者：綾部

class favShopScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.favshopscreen)

        //ホームボタン
        val homeButton : ImageView =findViewById(R.id.homeButton)

        //マイページ画面遷移
        homeButton.setOnClickListener {
            val intent = Intent(this,mypageScreen::class.java)
            startActivity(intent)
        }

        //お店ボタン
        //一応白い背景をボタンとする
        val backgroundWhite : ImageView =findViewById(R.id.backgroundWhite1)

        //新規登録画面3に遷移
            backgroundWhite.setOnClickListener {
            val intent = Intent(this,detailShopScreen::class.java)
            startActivity(intent)
        }

    }
}