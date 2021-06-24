package com.example.bookrentapp.repositery;

import com.example.bookrentapp.entity.collections.booksForRent.RentBook;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RentBookRepo extends MongoRepository<RentBook,String> {
}
