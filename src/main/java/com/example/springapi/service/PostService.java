package com.example.springapi.service;

import java.util.List;

import com.example.springapi.model.Post;

public interface PostService {
    List<Post> findAll();
    Post createdPost(Post post);
    Post updatedPost(Post post);
    void deletedPostById(Long id);
}
