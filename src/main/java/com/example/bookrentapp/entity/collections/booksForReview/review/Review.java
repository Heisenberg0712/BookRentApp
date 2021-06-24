package com.example.bookrentapp.entity.collections.booksForReview.review;

import lombok.Data;

import java.util.List;

@Data
public class Review {
   private int reviewId;
    private String authorId;
    private String content;
    private List<ReviewComment> reviewCommentList;


}
