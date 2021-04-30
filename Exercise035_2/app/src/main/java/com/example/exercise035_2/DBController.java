package com.example.exercise035_2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBController extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "datadiri.db";
    private static final int DATABASE_VERSION = 1;
    public DBController(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table Data(NIM varchar primary key, Nama text null, Alamat text null, Nomor text null );";
        Log.d("Data", "onCreate : " + sql);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {

    }
}
