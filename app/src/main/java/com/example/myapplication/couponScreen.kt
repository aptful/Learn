package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.zxing.integration.android.IntentIntegrator

//作成者：綾部

class couponScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mycoupon)

        //ホームボタン
        val homeButton: ImageView = findViewById(R.id.homeButton)

        //マイページ画面遷移
        homeButton.setOnClickListener {
            val intent = Intent(this, mypageScreen::class.java)
            startActivity(intent)
        }

        //クーポン利用
        val useBotton: Button = findViewById(R.id.useButton)

        useBotton.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("このクーポンを本当に利用しますか?")
                .setMessage("「利用する」ボタンをタップするとこのクーポンが削除されます")

                .setPositiveButton("利用する"){ dialog, which ->
                    val coupon: TextView = findViewById(R.id.couponText)
                    coupon.setVisibility(View.GONE)
                }
                .setNegativeButton("取り消す"){ dialog, which ->

                }
                .show()

        }


        //qrコード
        //スキャンボタン
        val qrButton: Button = findViewById(R.id.qrbutton)
        //スキャンボタンのクリックイベントを設定
        qrButton.setOnClickListener {
            val qrScan = IntentIntegrator(this)
            qrScan.setOrientationLocked(false)
            qrScan.setPrompt("QRコードを認識してください。")
            qrScan.initiateScan()
        }
    }

    override fun onActivityResult(
        requestCode: Int,
        resultCode: Int,
        data: Intent?
    ) {
        val result =
            IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
        if (result != null) {
            if (result.contents == null) {
                Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Scanned: " + result.contents, Toast.LENGTH_LONG).show()
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }
}