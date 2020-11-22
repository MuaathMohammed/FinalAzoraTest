package com.example.azorafinaltest.ui.Model;

public class NewsItems {
    int NewsId;

    public NewsItems() {
    }

    public NewsItems(int newsId, int IMageID, String user, String image) {
        NewsId = newsId;
        IMageID = IMageID;
        User = user;
        Image = image;
    }
int IMageID;
    String User;
    String Image;

    public int getNewsId() {
        return NewsId;
    }

    public void setNewsId(int newsId) {
        IMageID = newsId;
    }
    public int getIMageID() {
        return NewsId;
    }

    public void setIMageID(int newsId) {
        IMageID = newsId;
    }
    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
