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

private class AccountDBHelper(context: Context, databaseName:String,
                             factory: SQLiteDatabase.CursorFactory?, version: Int) :
    SQLiteOpenHelper(context, databaseName, factory, version) {

    //create table
    //sqlの実行
    //可変長，固定長の指定の仕方がわかりません...
    override fun onCreate(database: SQLiteDatabase?) {
        database?.execSQL("create table if not exists AccountTable (accounts_id integer primary key not null, passwords text not null, birth_on date not null, login boolean not null)");
    }

    //更新
    //sqlの実行
    override fun onUpgrade(database: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        if (oldVersion < newVersion) {
            database?.execSQL("alter table AccountTable add column deleteFlag integer default 0")
        }
    }
}


//main
class AccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private val dbName: String = "AccountDB"    //dbの名前の定義
    private val tableName: String = "AccountTable"  //tableの名前の定義
    private val dbVersion: Int = 1  //バージョン情報

    private var arrayListId: ArrayList<String> = arrayListOf()  //selectで用いる
    private var arrayListName: ArrayList<String> = arrayListOf()
    private var arrayListType: ArrayList<Int> = arrayListOf()
    private var arrayListBitmap: ArrayList<Bitmap> = arrayListOf()

    //insert
    private fun insertData(accounts_id: String, passwords: String, birth_on: String, login: String) {
        try {
            val dbHelper = AccountDBHelper(applicationContext, dbName, null, dbVersion);
            val database = dbHelper.writableDatabase

            val values = ContentValues()    // 挿入するデータはContentValuesに格納
            values.put("12345", accounts_id)
            values.put("g12test", passwords)
            values.put("2000"+"1"+"1", birth_on)
            values.put("true", login)
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
            val dbHelper = AccountDBHelper(applicationContext, dbName, null, dbVersion);
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

            val dbHelper = AccountDBHelper(applicationContext, dbName, null, dbVersion)
            val database = dbHelper.readableDatabase

            val sql =
                "select accounts_id, passwords, birth_on, image from $tableName where type in (1, 2) order by id"

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


