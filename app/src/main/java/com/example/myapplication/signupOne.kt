package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

//作成者：綾部，井口

class signupOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup1)

        val btnnext :Button =findViewById(R.id.nextButton)      //新規登録画面1の次へ
        val textPasswordEdit = findViewById<EditText>(R.id.passwordEdit)    //パスワード入力欄
        val textYearEdit = findViewById<EditText>(R.id.yearEdit)        //誕生年入力欄
        val textMonthEdit = findViewById<EditText>(R.id.monthEdit)      //誕生月入力欄
        val textDayEdit = findViewById<EditText>(R.id.dayEdit)          //誕生日入力欄

        //新規登録画面2に遷移
        btnnext.setOnClickListener {
            val intent = Intent(this, signupTwo::class.java)
            if(textPasswordEdit.length() > 0 && textYearEdit.length() > 0 && textMonthEdit.length() > 0 && textDayEdit.length() > 0){
                intent.putExtra("pass",textPasswordEdit.text.toString())
                startActivity(intent)
            }
        }

        //戻るボタン
        val backButton :ImageView =findViewById(R.id.backButton)

        //ホーム画面に遷移
        backButton.setOnClickListener {
            val intent = Intent(this,loginScreen::class.java)
            startActivity(intent)
        }

        //キャンセルボタン
        val cancelButton : Button =findViewById(R.id.cancelButton)

        //ホーム画面に遷移
        cancelButton.setOnClickListener {
            val intent = Intent(this,loginScreen::class.java)
            startActivity(intent)
        }
    }
}