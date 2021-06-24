package com.example.bookrentapp;

import com.example.bookrentapp.entity.collections.post.Post;
import com.example.bookrentapp.repositery.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

@SpringBootApplication
public class BookRentAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BookRentAppApplication.class, args);
    }
    @Autowired
    private PostRepo postRepo;
    @Override
    public void run(String... args) throws Exception {
    Post post = new Post("hello world","123","nice day"
    , LocalDate.of(2017, 1, 13), LocalTime.now(),new ArrayList<>(),new ArrayList<>());
    postRepo.save(post);


    }
}
