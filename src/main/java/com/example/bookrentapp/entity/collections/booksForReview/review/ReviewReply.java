package com.example.bookrentapp.entity.collections.booksForReview.review;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
public class ReviewReply {
    private String authorId;
    private int reviewReplyId;
    private String content;
    private LocalDate datePosted;
    private LocalTime timePosted;
    private List<ReviewLike> reviewLikeList;
}
