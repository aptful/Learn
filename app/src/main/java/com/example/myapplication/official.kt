package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

//作成者：綾部

class official : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.official)

        //新規登録画面2ボタン
        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.loadUrl("https://www.kutv.co.jp/colorful/")
        setContentView(myWebView)

    }
}