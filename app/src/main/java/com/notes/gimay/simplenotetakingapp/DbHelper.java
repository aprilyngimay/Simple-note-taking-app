package com.notes.gimay.simplenotetakingapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DbHelper extends SQLiteOpenHelper {

    public static final String TAG = "Create Note Table";

    //If you change the database schema,you must increment the database version
    public static final int DB_VERSION =1;
    public static final String DB_NAME = "app_notes.db";

    //for table name constant
    public static final String TABLE_NOTES = "notes";

    //for table title constant
    public static final String COL_TITLE = "title";

    //for table body constant
    public static final String COL_BODY = "body";

    //for table created constant
    public static final String COL_CREATED_AT = "created_at";

    //for table updated constant
    public static final String COL_UPDATED_AT = "updated_at";

    //for table primary key constant
    public static final String COL_ID = "id";

    public DbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
            String createNoteTable = "CREATE TABLE "+TABLE_NOTES+"(" +
                    COL_ID + " INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                    COL_TITLE + " TEXT, " +
                    COL_BODY + " TEXT, " +
                    COL_CREATED_AT + " TEXT, " +
                    COL_UPDATED_AT + " TEXT" +
                    ")";

            sqLiteDatabase.execSQL(createNoteTable);

            Log.d(TAG, createNoteTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
