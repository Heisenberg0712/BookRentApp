package com.example.bookrentapp.entity.collections.booksForRent;

import com.example.bookrentapp.entity.collections.author.Author;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@Document("rentbook")
public class RentBook {
    @Id
    private String rentBookId;
    private String name;
    private List<String> genre;
    private List<String> rentersId;
    private LocalDate datePosted;
    private LocalTime timePosted;
    private Author borrower;
    private LocalTime timeBorrowed;
    private LocalDate dateBorrowed;
    private String type;

    public RentBook(String name, List<String> genre, List<String> rentersId, LocalDate datePosted, LocalTime timePosted,
                    Author borrower, LocalTime timeBorrowed, LocalDate dateBorrowed, String type) {
        this.name = name;
        this.genre = genre;
        this.rentersId = rentersId;
        this.datePosted = datePosted;
        this.timePosted = timePosted;
        this.borrower = borrower;
        this.timeBorrowed = timeBorrowed;
        this.dateBorrowed = dateBorrowed;
        this.type = type;
    }
}
