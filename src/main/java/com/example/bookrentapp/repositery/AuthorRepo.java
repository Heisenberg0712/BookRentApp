package com.example.bookrentapp.repositery;

import com.example.bookrentapp.entity.collections.author.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepo extends MongoRepository<Author,String> {
}
