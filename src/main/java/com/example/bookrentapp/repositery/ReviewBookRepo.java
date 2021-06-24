package com.example.bookrentapp.repositery;

import com.example.bookrentapp.entity.collections.booksForReview.ReviewBook;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewBookRepo extends MongoRepository<ReviewBook,String> {
}
