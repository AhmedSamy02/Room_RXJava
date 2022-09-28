package com.example.room.DAO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.room.models.PostModel;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;

@Dao
public interface PostsDao {
    @Insert
    Completable insertPost(PostModel postModel);
    @Query("select * from posts_table")
    Single<List<PostModel>>getPosts();
}
