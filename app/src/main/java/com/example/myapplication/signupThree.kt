package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.CheckBox
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView





//作成者：綾部，井口

class signupThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup3)

        //値の受け取り
        val textPasswordEdit = intent.getStringExtra("passwordKey") //パスワード
        val textYearEdit = intent.getStringExtra("yearKey") //誕生年
        val textMonthEdit = intent.getStringExtra("monthKey")   //誕生月
        val textDayEdit = intent.getStringExtra("dayKey")   //誕生日

        //textEditの上書き表示
        //パスワード
        val passText = findViewById<View>(R.id.password_edit_signupText) as TextView
//        passText.text = "  " + textPasswordEdit
        if (textPasswordEdit != null) {
            when (textPasswordEdit.length) {
                6 -> {
                    passText.text = "  ●●●●●●" }
                7 -> {
                    passText.text = "  ●●●●●●●"
                }
                8 -> {
                    passText.text = "  ●●●●●●●●"
                }
                else -> {
                    passText.text = "  範囲外だよ"
                }
            }
        }
        //生年月日
        val birthText =  findViewById<View>(R.id.birthday_edit_signupText) as TextView
        birthText.text = "  " + textYearEdit + "年" + textMonthEdit + "月" + textDayEdit + "日"

        //完了ボタン
        val completeButton: Button = findViewById(R.id.okButton)
        //完了ボタンが押されたら
        completeButton.setOnClickListener {
            val intent = Intent(this, mypageScreen::class.java)
            if (checkBoxState[0].equals(1)) {
                startActivity(intent)
            }
        }



        //戻るボタン
        val backButton : ImageView = findViewById(R.id.backButton)

        //新規登録画面2に遷移
        backButton.setOnClickListener {
            val intent = Intent(this,signupTwo::class.java)
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


    var checkBoxState = arrayOf(0)
    //チェックボックスが押されたら
    fun onCheckboxClicked(view: View) {
            if (view is CheckBox) {
                var checked: Boolean = view.isChecked
                when (view.id) {
                    R.id.checkbox -> {
                        if (checked) {
                            checkBoxState[0] = 1
                        } else {
                            checkBoxState[0] = 0
                        }
                    }
                }
            }
        }


}