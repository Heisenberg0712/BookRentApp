package com.example.bookrentapp.entity.collections.author;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
public class AuthorLike {
    private LocalDate dateLiked;
    private LocalTime timeLiked;
    private String type;
    private int typeId;
}
