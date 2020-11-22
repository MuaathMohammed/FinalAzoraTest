package com.example.azorafinaltest.ui.LocalData;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.azorafinaltest.ui.Items.Constants;
import com.example.azorafinaltest.ui.Model.NewsItems;

import static com.example.azorafinaltest.ui.Items.Constants.DATABASE_TABLE_NAME;
import static com.example.azorafinaltest.ui.Items.Constants.DATABASE_TABLE_NAME_IMAGES;
import static com.example.azorafinaltest.ui.Items.Constants.IMAGEID;
import static com.example.azorafinaltest.ui.Items.Constants.Image;
import static com.example.azorafinaltest.ui.Items.Constants.UID;
import static com.example.azorafinaltest.ui.Items.Constants.User;
import static com.example.azorafinaltest.ui.Items.Constants.User_ID;


public class DBHelper extends SQLiteOpenHelper {

    private Context context;


    public DBHelper(Context context) {
        super(context, Constants.DATABASE_NAME, null, Constants.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Constants.CREATE_TABLE_USERS);
        db.execSQL(Constants.CREATE_TABLE_IMAGES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(Constants.DROP_TABLE_NEWS);
        db.execSQL(Constants.DROP_TABLE_IMAGES);

        onCreate(db);
    }
    public boolean create(NewsItems information) {
        boolean createSuccessful = false;

        ContentValues values = new ContentValues();

        values.put(User_ID, information.getNewsId());
        values.put(User, information.getUser());
        SQLiteDatabase db = this.getWritableDatabase();

        createSuccessful = db.insertWithOnConflict(Constants.DATABASE_TABLE_NAME, null, values,SQLiteDatabase.CONFLICT_REPLACE)>0;
        db.close();
        return createSuccessful;
    }
    public boolean createim(NewsItems information) {
        boolean createSuccessful = false;

        ContentValues values = new ContentValues();
        values.put(IMAGEID, information.getIMageID());
        values.put(UID, information.getNewsId());
        values.put(Image, information.getImage());
        SQLiteDatabase db = this.getWritableDatabase();

        createSuccessful = db.insertWithOnConflict(DATABASE_TABLE_NAME_IMAGES, null, values,SQLiteDatabase.CONFLICT_REPLACE) > 0;
        db.close();
        return createSuccessful;
    }
}
