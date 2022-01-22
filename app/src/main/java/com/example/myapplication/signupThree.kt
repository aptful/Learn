package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.ListView
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.AdapterView
import android.view.Gravity
import androidx.appcompat.app.AlertDialog
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.annotation.NonNull
import androidx.annotation.LayoutRes




//作成者：綾部，井口，久保田

class signupThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup3)

        //値の受け取り
        val textPasswordEdit = intent.getStringExtra("passwordKey")
        val textYearEdit = intent.getStringExtra("yearKey")
        val textMonthEdit = intent.getStringExtra("monthKey")
        val textDayEdit = intent.getStringExtra("dayKey")
        val favKeyword = intent.getStringArrayExtra("favKey")

        //TexiViewの上書き表示
        //パスワード
        val passText = findViewById<View>(R.id.password_edit_signupText) as TextView
        //入力された文字数分だけ●表示
        //6~8文字しか想定してないです
        if (textPasswordEdit != null) {
            when (textPasswordEdit.length) {
                6 -> {
                    passText.text = "  ●●●●●●"
                }
                7 -> {
                    passText.text = "  ●●●●●●●"
                }
                8 -> {
                    passText.text = "  ●●●●●●●●"
                }else -> {
                passText.text = "範囲外です！"
                }
            }
        }
        //生年月日
        val birthText =  findViewById<View>(R.id.birthday_edit_signupText) as TextView
        birthText.text = "  " + textYearEdit + "年" + textMonthEdit + "月" + textDayEdit + "日"


        //キーワード
        //改行されへんから追加された一番下しか表示できない
//        val favKeywordText = findViewById<View>(R.id.favKeywordText) as TextView
        var temp:Array<String?> = arrayOf("りんご", "りんご2")
            // xmlにて実装したListViewの取得
            val favKeywordView = findViewById<ListView>(R.id.favKeywordText)
            // ArrayAdapterの生成
            val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, temp)
            // ListViewに、生成したAdapterを設定
            favKeywordView.adapter = adapter


//        favKeywordText.text = favKeyword!![0] +  "，" + favKeyword!![1] +  "，" + favKeyword!![2] +  "，" + favKeyword!![3] +  "，" + favKeyword!![4] +  "，" + favKeyword!![5] +  "，" + favKeyword!![6] +  "，" + favKeyword!![7] +  "，" + favKeyword!![8] +  "，" + favKeyword!![9]
//        if (favKeyword != null) {
//            for (i in 0..9){
//                if (favKeyword[i] == null){
//                }else{
//                    for(j in 0..i) {
//                        favKeywordText.text = "  \n"
//                    }
//                        favKeywordText.text = favKeyword[i]
//                }
//            }
//        }


//        if (favKeyword != null) {
////            for (i in 0..9){
////                if (favKeyword[i] == null){
////                }else{
//                    for(j in favKeyword.indices) {
//                        favKeywordText.text = favKeyword[j]
//                    }
////                }
////            }
//        }


        //完了ボタン
        val completeButton: Button = findViewById(R.id.okButton)

//       //完了ボタンが押されたら
//    completeButton.setOnClickListener {
//             val intent = Intent(this, mypageScreen::class.java)
//               if (checkBoxState[0].equals(1)) {
//                  startActivity(intent)
//                }
//           }

        //ユーザ登録完了ポップアップ
        completeButton.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("登録完了")
                .setMessage("ログインしてみましょう")

                .setPositiveButton("OK"){ dialog, which ->
                    val intent = Intent(this,loginScreen::class.java)
                    startActivity(intent)
                }

                .show()

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