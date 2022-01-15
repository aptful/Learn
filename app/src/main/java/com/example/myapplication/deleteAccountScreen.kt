package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

//作成者：綾部

class deleteAccountScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.withdrawalshow)

        //戻るボタン
        val backButton : ImageView =findViewById(R.id.backButton)

        //新規登録画面2に遷移
        backButton.setOnClickListener {
            val intent = Intent(this,configScreen::class.java)
            startActivity(intent)
        }

        //ホームボタン
        val homeButton : ImageView =findViewById(R.id.homeButton)

        //マイページ画面遷移
        homeButton.setOnClickListener {
            val intent = Intent(this,mypageScreen::class.java)
            startActivity(intent)
        }
        //退会ボタン
        val btnwithdrawal : Button =findViewById(R.id.withdrawalbutton)

        //退会確認ポップアップ
        btnwithdrawal.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("退会するとこのアカウントは削除されます")
                .setMessage("本当によろしいですか?")

                .setPositiveButton("いいえ"){ dialog, which ->

                }
                .setNegativeButton("はい"){ dialog, which ->
                    val intent = Intent(this,loginScreen::class.java)
                    startActivity(intent)
                }
                .show()

        }

    }
}