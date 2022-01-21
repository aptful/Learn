package com.example.myapplication

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

//作成者：綾部，井口

class signupOne : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
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

        //今日の日付を取得
        val dateNow: LocalDate = LocalDate.now()
        //今日の日付をyyyymmddに変換
        val dateSum = dateNow.year * 10000 + dateNow.monthValue * 100 + dateNow.dayOfMonth

        //新規登録画面1の次へ
        val nextButton: Button = findViewById(R.id.nextButton)

        //新規登録画面2に遷移
        nextButton.setOnClickListener {
            val intent = Intent(this, signupTwo::class.java)
            //入力制限．パスワードが6文字以上，誕生年が4文字以上，誕生月日が1文字以上
            if (textPasswordEdit.length() > 5 && textYearEdit.length() > 3 && textMonthEdit.length() > 0 && textDayEdit.length() > 0) {
                //誕生年が1901年以上
                //（今日の日付）-（誕生年*10000 + 誕生月*100 + 誕生日 + 1）の結果が正
                //生年月日をyyyymmddに変換
                val birth = textYearEdit.getText().toString().toInt() * 10000 + textMonthEdit.getText().toString().toInt() * 100 + textDayEdit.getText().toString().toInt() - 1
                if (textYearEdit.getText().toString().toInt() > 1900 && (dateSum - birth) > 0) {
                    //誕生月によって日にちの制限．うるう年を想定して2月はどの年でも29日を入力可としている
                    when (textMonthEdit.getText().toString().toInt()) {
                        1, 3, 5, 7, 8, 10, 12 -> {
                            if (32 > textDayEdit.getText().toString().toInt()) {
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
                        4, 6, 9, 11-> {
                            if (31 > textDayEdit.getText().toString().toInt()) {
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
                        2 -> {
                            if (30 > textDayEdit.getText().toString().toInt()) {
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
                    }
                }
            }
        }

        //戻るボタン
        val backButton: ImageView = findViewById(R.id.backButton)

        //ログイン画面に遷移
        backButton.setOnClickListener {
            val intent = Intent(this, loginScreen::class.java)
            startActivity(intent)
        }

        //キャンセルボタン
        val cancelButton: Button = findViewById(R.id.cancelButton)

        //ログイン画面に遷移
        cancelButton.setOnClickListener {
            val intent = Intent(this, loginScreen::class.java)
            startActivity(intent)
        }

    }
}
