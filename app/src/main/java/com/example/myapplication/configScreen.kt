package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog

//作成者：綾部

class configScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.option)

        //ホームボタン
        val homeButton : ImageView = findViewById(R.id.homeButton)

        //マイページ画面遷移
        homeButton.setOnClickListener {
            val intent = Intent(this,mypageScreen::class.java)
            startActivity(intent)
        }
        //アカウント内容確認ボタン
        val nextButton : Button = findViewById(R.id.accountButton)

        //アカウント内容確認画面に遷移
        nextButton.setOnClickListener {
            val intent = Intent(this,checkAccountScreen::class.java)
            startActivity(intent)
        }

        //利用規約ボタン
        val ruleButton : Button = findViewById(R.id.ruleButton)

        //利用規約画面に遷移
        ruleButton.setOnClickListener {
            val intent = Intent(this,ruleScreen::class.java)
            startActivity(intent)
        }

        //ログアウトボタン
        val logoutButton : Button = findViewById(R.id.logoutButton)

        //ログアウト確認ポップアップ
        logoutButton.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("ログアウトしますか?")

                .setPositiveButton("いいえ"){ dialog, which ->
                }

                .setNegativeButton("はい"){ dialog, which ->
                    val intent = Intent(this,loginScreen::class.java)
                    startActivity(intent)
                }
                .show()

        }

        //退会ボタン
        val signoutButton : Button = findViewById(R.id.signoutButton)

        //退会確認画面に遷移
        signoutButton.setOnClickListener {
            val intent = Intent(this,deleteAccountScreen::class.java)
            startActivity(intent)
        }
    }
}