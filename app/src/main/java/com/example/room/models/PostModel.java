package com.example.room.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "posts_table")
public class PostModel {
    String title;
    String body;
    int userId;
    @PrimaryKey(autoGenerate = true)
    int id;

    public PostModel(String title, String body, int userId) {
        this.title = title;
        this.body = body;
        this.userId = userId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }
}
