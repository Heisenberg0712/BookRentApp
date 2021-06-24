package com.example.bookrentapp.entity.collections.post;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
@Data
public class PostReply {
    private int replyId;
    private String authorId;
    private LocalTime timePosted;
    private LocalDate datePosted;
    private String content;
    private List<PostLike> totalLike;
}
