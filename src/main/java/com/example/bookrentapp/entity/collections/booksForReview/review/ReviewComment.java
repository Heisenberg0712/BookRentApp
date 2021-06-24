package com.example.bookrentapp.entity.collections.booksForReview.review;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
public class ReviewComment {
    private int reviewCommentId;
    private String authorId;
    private String content;
    private LocalTime timePosted;
    private LocalDate datePosted;
    private List<ReviewReply> reviewReplyList;
    private List<ReviewLike> reviewLikeList;
}
