package com.example.bookrentapp.entity.collections.booksForReview;

import com.example.bookrentapp.entity.collections.booksForReview.review.Review;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("reviewbook")
public class ReviewBook {
    @Id
    private String bookId;
    private String name;
    private String writer;
    private List<String> genre;
    private List<Review> reviewList;
    private int rating;

    public ReviewBook(String name, String writer, List<String> genre,
                      List<Review> reviewList, int rating) {
        this.name = name;
        this.writer = writer;
        this.genre = genre;
        this.reviewList = reviewList;
        this.rating = rating;
    }
}
