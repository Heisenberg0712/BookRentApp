package com.example.bookrentapp.repositery;

import com.example.bookrentapp.entity.collections.post.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepo extends MongoRepository<Post,String> {
}
