package com.example.bookrentapp.entity.collections.author;

import lombok.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("author")
public class Author {
    @Id
    private String authorId;

    private String name;

    private String userName;
    private String email;
    private String contactNumber;
    private List<String> postIdList;
    private List<AuthorComment> authorCommentList;
    private List<AuthorReply> authorReplyList;
    private List<AuthorLike> authorLikeList;
    private List<Integer> follower;
    private List<Integer> following;
    private int rating;
    private List<String> preferences;

    public Author(String name, String userName, String email, String contactNumber, List<String> postIdList,
                  List<AuthorComment> authorCommentList, List<AuthorReply> authorReplyList, List<AuthorLike> authorLikeList,
                  List<Integer> follower, List<Integer> following, int rating, List<String> preferences)
    {
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.contactNumber = contactNumber;
        this.postIdList = postIdList;
        this.authorCommentList = authorCommentList;
        this.authorReplyList = authorReplyList;
        this.authorLikeList = authorLikeList;
        this.follower = follower;
        this.following = following;
        this.rating = rating;
        this.preferences = preferences;
    }
}
