package com.example.bookrentapp.entity.collections.post;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@Document("post")
public class Post {
    @Id
    private String postId;
    private String postContent;
    private String authorId;
    private String caption;
    private LocalDate datePosted;
    private LocalTime timePosted;
    private List<PostComment> postComments;
    private List<PostLike> totalLikes;

    public Post(String postContent, String authorId, String caption, LocalDate datePosted, LocalTime timePosted,
                List<PostComment> postComments, List<PostLike> totalLikes) {
        this.postContent = postContent;
        this.authorId = authorId;
        this.caption = caption;
        this.datePosted = datePosted;
        this.timePosted = timePosted;
        this.postComments = postComments;
        this.totalLikes = totalLikes;
    }
}
