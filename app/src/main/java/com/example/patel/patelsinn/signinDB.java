package com.example.patel.patelsinn;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by patel on 2016-04-17.
 */



public class signinDB extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "signin.db";
    private static final String TABLE_SIGNINS = "signins";

    public static String username = "username";
    public static String password = "password";

    public signinDB(Context context) {
        super(context, DATABASE_NAME, null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_SIGNINS_TABLE = "CREATE TABLE " +
                TABLE_SIGNINS + "("
                + username + " TEXT PRIMARY KEY," + password
                + " TEXT" + ")";
        db.execSQL(CREATE_SIGNINS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,
                          int newVersion) {

    }


}
