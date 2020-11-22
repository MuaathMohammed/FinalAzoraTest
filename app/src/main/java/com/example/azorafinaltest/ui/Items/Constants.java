package com.example.azorafinaltest.ui.Items;

public class Constants {
    public static final String DATABASE_NAME="News.db";
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_TABLE_NAME="Users";
    public static final String DATABASE_TABLE_NAME_IMAGES="IMAGES";

    public static final String COLUMN_KEY_ID = "_id", User_ID ="NewsId",UID="UID",IMAGEID="ID";
    public static final String User="User";
    public static final String Image="Image";

    public static final String CREATE_TABLE_USERS ="CREATE TABLE "+DATABASE_TABLE_NAME+"( "+ User_ID +" INTEGER PRIMARY KEY AUTOINCREMENT,"+ User +" VARCHAR(255));";
    public static final String CREATE_TABLE_IMAGES ="CREATE TABLE "+DATABASE_TABLE_NAME_IMAGES+"( "+ IMAGEID +" INTEGER PRIMARY KEY AUTOINCREMENT,"+ Image +" VARCHAR(255),"+
            UID+" INTEGER,FOREIGN KEY("+UID+") REFERENCES Users("+ User_ID +"));";
    public static final String DROP_TABLE_NEWS = "DROP TABLE IF EXISTS "+DATABASE_TABLE_NAME;
    public static final String DROP_TABLE_IMAGES = "DROP TABLE IF EXISTS "+DATABASE_TABLE_NAME_IMAGES;

}
