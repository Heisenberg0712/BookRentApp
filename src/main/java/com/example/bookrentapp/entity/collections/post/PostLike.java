package com.example.bookrentapp.entity.collections.post;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
public class PostLike {
    private String authorId;
    private LocalDate dateLiked;

    private LocalTime timeLiked;

}
