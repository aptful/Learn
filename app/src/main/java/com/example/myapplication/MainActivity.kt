package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup1)

        val signupTwo = findViewById<Button>(R.id.signupTwo)    //新規登録画面1の【次へ】

        signupTwo.setOnClickListener {
            //Intentオブジェクト生成、遷移画面定義
            val nextIntent = Intent(this, IntentTestActivity::class.java)
            //次のActivity実行
            startActivity(nextIntent)
        }
    }

}