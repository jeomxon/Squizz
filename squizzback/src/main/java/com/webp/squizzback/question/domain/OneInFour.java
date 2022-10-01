package com.webp.squizzback.question.domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue("FOUR")
public class OneInFour extends Question {

    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
}
