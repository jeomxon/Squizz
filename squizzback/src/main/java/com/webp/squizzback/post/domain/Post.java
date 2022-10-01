package com.webp.squizzback.post.domain;

import com.webp.squizzback.member.domain.Member;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    private String title;
    private String category;
    private QuestionType questionType;
    private int numOfQuestion;
    private LocalDateTime pubDate;
    private DifficultyType difficultyType;
    private boolean isSolved;

}
