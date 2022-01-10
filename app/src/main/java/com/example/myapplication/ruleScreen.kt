package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

//作成者：綾部

class ruleScreen : AppCompatActivity() {
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
        //アカウント内容確認ボタン
        val btnnext : Button =findViewById(R.id.nextButton)

        //アカウント内容確認画面に遷移
        btnnext.setOnClickListener {
            val intent = Intent(this,::class.java)
            startActivity(intent)
        }

    }
}