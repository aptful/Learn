package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.app.Activity

//作成者：綾部，井口

class signupOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup1)


        val textPasswordEdit = findViewById<EditText>(R.id.passwordEdit)    //パスワード入力欄
        val textYearEdit = findViewById<EditText>(R.id.yearEdit)        //誕生年入力欄
        val textMonthEdit = findViewById<EditText>(R.id.monthEdit)      //誕生月入力欄
        val textDayEdit = findViewById<EditText>(R.id.dayEdit)          //誕生日入力欄

        val nextButton :Button =findViewById(R.id.nextButton)      //新規登録画面1の次へ

        //新規登録画面2に遷移
        nextButton.setOnClickListener {
            val intent = Intent(this, signupTwo::class.java)
            if(textPasswordEdit.length() > 0 && textYearEdit.length() > 0 && textMonthEdit.length() > 0 && textDayEdit.length() > 0){
                intent.putExtra("passwordKey", textPasswordEdit.getText().toString());  //パスワードの値引き渡し
                intent.putExtra("yearKey", textYearEdit.getText().toString());  //誕生年の値引き渡し
                intent.putExtra("monthKey", textMonthEdit.getText().toString());  //誕生月の値引き渡し
                intent.putExtra("dayKey", textDayEdit.getText().toString());  //誕生日の値引き渡し
                startActivity(intent)
            }
        }

        //戻るボタン
        val backButton :ImageView = findViewById(R.id.backButton)

        //ログイン画面に遷移
        backButton.setOnClickListener {
            val intent = Intent(this,loginScreen::class.java)
            startActivity(intent)
        }

        //キャンセルボタン
        val cancelButton : Button = findViewById(R.id.cancelButton)

        //ログイン画面に遷移
        cancelButton.setOnClickListener {
            val intent = Intent(this,loginScreen::class.java)
            startActivity(intent)
        }
    }
}