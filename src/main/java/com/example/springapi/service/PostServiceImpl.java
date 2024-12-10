package com.example.springapi.service;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapi.model.Post;
import com.example.springapi.repository.PostRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    @Override
    public List<Post> findAll() {
       return postRepository.findAll();
    }

    @Override
    public Post createdPost(Post post) {
        post.setCreatedDate(new Date(System.currentTimeMillis()));
        
       return postRepository.save(post);
    }

    @Override
    public Post updatedPost(Post post) {
        Post exixtingPost = postRepository.findById(post.getId()).get();
        exixtingPost.setText(post.getText());
        exixtingPost.setModifiedDate(new Date(System.currentTimeMillis()));
       return postRepository.save(exixtingPost);
    }

    @Override
    public void deletedPostById(Long id) {
        postRepository.deleteById(id);
        
    }

}
