package com.example.localstorage;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {


    public static final String DATA_TABLE = "DATA_TABLE";
    public static final String COLUMN_DATA_ID = "DATA_ID";
    public static final String COLUMN_DATA_TEXT = "DATA_TEXT";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATA_TABLE+".db", null, 1);
    }


    @SuppressLint("SQLiteString")
    @Override
    public void onCreate(SQLiteDatabase db) {
       String query = "CREATE TABLE " + DATA_TABLE + " (" + COLUMN_DATA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMN_DATA_TEXT + " STRING)";
       db.execSQL(query);
    }

public boolean AddOne(DataModel dataModel){
SQLiteDatabase db = this.getWritableDatabase();
    ContentValues cv = new ContentValues();
    cv.put(COLUMN_DATA_TEXT,dataModel.getMsg());
    long insert = db.insert(DATA_TABLE, null, cv);
    if(insert == -1){
        return false;
    } else{
        return true;
    }

}
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
