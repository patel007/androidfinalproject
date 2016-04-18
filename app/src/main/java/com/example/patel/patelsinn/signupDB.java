package com.example.patel.patelsinn;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by patel on 2016-04-18.
 */
public class signupDB extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "signup.db";
    private static final String TABLE_SIGNUPS = "signups";

    SQLiteDatabase sql;

    private static String first_name = "first_name";
    private static String last_name = "last_name";
    private static String email = "email";
    private static String password = "password";
    private static String address1 = "address1";
    private static String address2 = "address2";
    private static String city = "city";
    private static String province = "province";
    private static String country = "country";
    private static String postal_code = "postal_code";

    public signupDB(Context context) {
        super(context, DATABASE_NAME, null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_SIGNINS_TABLE = "CREATE TABLE " +
                TABLE_SIGNUPS + "("
                + first_name + " TEXT PRIMARY KEY," + last_name+ " TEXT "+ email+ " TEXT "+ password
                + " TEXT" + address1+ " TEXT "+ address2+ " TEXT "+ city + " TEXT "+ province + " TEXT "+
                country + " TEXT "+ postal_code + " TEXT "+ ")";
        db.execSQL(CREATE_SIGNINS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,
                          int newVersion) {

    }
    public void add(signup ss){
        ContentValues v = new ContentValues();
        v.put(first_name,ss.getFirst_name());
        v.put(last_name, ss.getLast_name());
        v.put(email,ss.getEmail());
        v.put(password,ss.getPassword());
        v.put(address1,ss.getAddress1());
        v.put(address2, ss.getAddress2());
        v.put(city,ss.getCity());
        v.put(province, ss.getProvince());
        v.put(country, ss.getCountry());
        v.put(postal_code,ss.getPostal_code());

        sql = this.getWritableDatabase();

        sql.insert(TABLE_SIGNUPS, null, v);
    }
}
