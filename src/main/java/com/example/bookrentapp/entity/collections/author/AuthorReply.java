package com.example.bookrentapp.entity.collections.author;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
public class AuthorReply {
    private String replyContent;
    private LocalDate datePosted;
    private LocalTime timePosted;
    private int commentId;
}
