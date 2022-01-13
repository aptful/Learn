package com.example.databesesample


import android.app.Activity
import android.content.Context
import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.util.Log
import java.io.ByteArrayOutputStream


//SQLiteOpenHelperの準備

private class ShopDBHelper(context: Context, databaseName:String,
                              factory: SQLiteDatabase.CursorFactory?, version: Int) :
    SQLiteOpenHelper(context, databaseName, factory, version) {

    //create table
    //sqlの実行
    //可変長，固定長の指定の仕方がわかりません...
    override fun onCreate(database: SQLiteDatabase?) {
        database?.execSQL("create table if not exists ShopTable (shop_id integer primary key not null, shop_name text not null, address text, tel_number integer not null, access text, opened_on time, closed_on time, holiday text not null, introduce text not null, broadcast date not null, keyword1_id integer not null, keyword2_id integer, keyword3_id integer, keyword4_id integer, keyword5_id integer, keyword6_id integer,photo integer not null)");
    }

    //更新
    //sqlの実行
    override fun onUpgrade(database: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        if (oldVersion < newVersion) {
            database?.execSQL("alter table ShopTable add column deleteFlag integer default 0")
        }
    }
}


//main
class ShopActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private val dbName: String = "ShopDB"    //dbの名前の定義
    private val tableName: String = "ShopTable"  //tableの名前の定義
    private val dbVersion: Int = 1  //バージョン情報

    private var arrayListId: ArrayList<String> = arrayListOf()  //selectで用いる
    private var arrayListName: ArrayList<String> = arrayListOf()
    private var arrayListType: ArrayList<Int> = arrayListOf()
    private var arrayListBitmap: ArrayList<Bitmap> = arrayListOf()

    //insert
    private fun insertData(shop_id: String, shop_name: String, address: String, tel_number: String, access: String, opened_on: String, closed_on: String, holiday: String, introduce: String, broadcast: String, keyword1_id: String, keyword2_id: String, keyword3_id: String, keyword4_id: String, keyword5_id: String, keyword6_id: String, photo: String) {
        try {
            val dbHelper = ShopDBHelper(applicationContext, dbName, null, dbVersion);
            val database = dbHelper.writableDatabase

            val values = ContentValues()    // 挿入するデータはContentValuesに格納
            values.put("12345", shop_id)
            values.put("カフェA", shop_name)
            values.put("香美市土佐山田町", address)
            values.put("090-1234-5678", tel_number)
            values.put("土佐山田駅から徒歩五分", access)
            values.put("10"+"00", opened_on)
            values.put("18"+"30", closed_on)
            values.put("毎週月曜日", holiday)
            values.put("ゆったりとした空間でほっと一息", introduce)
            values.put("2021"+"1"+"1", broadcast)
            values.put("10001", keyword1_id)
            values.put("10002", keyword2_id)
            values.put("10003", keyword3_id)
            values.put("10004", keyword4_id)
            values.put("10005", keyword5_id)
            values.put("10006", keyword6_id)
            values.put("image001", photo)
            val byteArrayOutputStream = ByteArrayOutputStream();    //データがバイト配列に書き込まれる出力ストリームを実装
            val bytes = byteArrayOutputStream.toByteArray()
            values.put("image", bytes)
            // tableNameに1件追加
            database.insertOrThrow(tableName, null, values)
        } catch (exception: Exception) {
            Log.e("insertData", exception.toString())
        }
    }

    //idをwhere句とするupdate(更新)
    private fun updateData(whereId: String, newName: String, newType: Int, newBitmap: Bitmap) {
        try {
            val dbHelper = ShopDBHelper(applicationContext, dbName, null, dbVersion);
            val database = dbHelper.writableDatabase

            val values = ContentValues()
            values.put("name", newName)
            values.put("type", newType)
            val byteArrayOutputStream = ByteArrayOutputStream();
            val bytes = byteArrayOutputStream.toByteArray()
            values.put("image", bytes)

            val whereClauses = "id = ?"
            val whereArgs = arrayOf(whereId)
            database.update(tableName, values, whereClauses, whereArgs)
        } catch (exception: Exception) {
            Log.e("updateData", exception.toString())
        }
    }

    //select
    private fun selectData() {
        try {
            arrayListId.clear();
            arrayListName.clear();
            arrayListType.clear();
            arrayListBitmap.clear() //初期化

            val dbHelper = ShopDBHelper(applicationContext, dbName, null, dbVersion)
            val database = dbHelper.readableDatabase

            val sql =
                "select shop_id, shop_name, opened_on, closed_on from $tableName where type in (1, 2) order by shop_id"

            val cursor = database.rawQuery(sql, null)   //rawQueryで呼び出した実行結果がCursorに格納される
            if (cursor.count > 0) {
                cursor.moveToFirst()
                while (!cursor.isAfterLast) {   // 検索結果の件数分だけ繰り返される?
                    arrayListId.add(cursor.getString(0))    // 検索結果をCursorから取り出し，arrayListIdに確保
                    arrayListName.add(cursor.getString(1))
                    arrayListType.add(cursor.getInt(2))
                    val blob: ByteArray = cursor.getBlob(3)
                    val bitmap = BitmapFactory.decodeByteArray(blob, 0, blob.size)
                    arrayListBitmap.add(bitmap)
                    cursor.moveToNext()
                }
            }
        }catch(exception: Exception) {
            Log.e("selectData", exception.toString());
        }
    }
}
