package com.webp.squizzback.member.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Member {

    @Id
    @Column(name = "member_id")
    private String id;

    @Column(name = "member_pw")
    private String password;

    private String nickname;
    private int totalScore;
}
