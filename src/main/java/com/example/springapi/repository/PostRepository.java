package com.example.springapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapi.model.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}
