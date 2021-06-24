package com.example.bookrentapp.entity.collections.post;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
@Data
public class PostComment {
    private String authorId;
    private int commentId;
    private String content;
    private LocalTime timePosted;
    private LocalDate datePosted;
    private List<PostLike> totalLike;
}
