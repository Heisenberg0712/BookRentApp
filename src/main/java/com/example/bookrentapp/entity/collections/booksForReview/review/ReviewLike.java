package com.example.bookrentapp.entity.collections.booksForReview.review;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class ReviewLike {
    private String authorId;
    private LocalTime timeLiked;
    private LocalDate dateLiked;
}
