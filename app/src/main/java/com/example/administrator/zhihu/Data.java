package com.example.administrator.zhihu;

public class Data {
    private String imageUrl;
    private String title;
    private int id;
    private String date;

    public Data(String imageUrl, String title, int id) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.id = id;
    }

    public Data(String date) {
        this.date = date;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {

        return imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
