package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

//作成者：綾部

class configScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.option)

        //ホームボタン
        val homeButton : ImageView =findViewById(R.id.homeButton)

        //マイページ画面遷移
        homeButton.setOnClickListener {
            val intent = Intent(this,mypageScreen::class.java)
            startActivity(intent)
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