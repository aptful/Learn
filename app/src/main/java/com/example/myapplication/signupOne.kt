package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.view.Gravity

//作成者：綾部，井口

class signupOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup1)

        //パスワード入力欄
        val textPasswordEdit = findViewById<EditText>(R.id.passwordEdit)
        //誕生年入力欄
        val textYearEdit = findViewById<EditText>(R.id.yearEdit)
        //誕生月入力欄
        val textMonthEdit = findViewById<EditText>(R.id.monthEdit)
        //誕生日入力欄
        val textDayEdit = findViewById<EditText>(R.id.dayEdit)
        //新規登録画面1の次へ
        val nextButton :Button =findViewById(R.id.nextButton)

        //新規登録画面2に遷移
        nextButton.setOnClickListener {
            val intent = Intent(this, signupTwo::class.java)
            if(textPasswordEdit.length() > 5 && textYearEdit.length() > 3 && textMonthEdit.length() > 0 && textDayEdit.length() > 0){
                //値の引き渡し
                //パスワード
                intent.putExtra("passwordKey", textPasswordEdit.getText().toString())
                //誕生年
                intent.putExtra("yearKey", textYearEdit.getText().toString())
                //誕生月
                intent.putExtra("monthKey", textMonthEdit.getText().toString())
                //誕生日
                intent.putExtra("dayKey", textDayEdit.getText().toString())
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