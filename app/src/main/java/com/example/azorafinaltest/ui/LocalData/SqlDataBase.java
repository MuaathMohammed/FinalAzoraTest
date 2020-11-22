package com.example.azorafinaltest.ui.LocalData;

import android.content.Context;

public class SqlDataBase {

    private DBHelper databaseHelper;

    public SqlDataBase(Context context){
        databaseHelper = new DBHelper(context);
    }


}
