package com.daresh.blogServer.service;

import com.daresh.blogServer.entity.Post;
import com.daresh.blogServer.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class PostServiceImpl implements PostService{

    @Autowired //injection of post service
    private PostRepository postRepository;

    public Post savePost(Post post){
        post.setLikeCount(0);
        post.setViewCount(0);
        post.setDate(new Date(System.currentTimeMillis()));

        return postRepository.save(post);



    }
}
