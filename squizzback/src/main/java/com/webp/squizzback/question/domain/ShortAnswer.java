package com.webp.squizzback.question.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SHORT")
public class ShortAnswer extends Question {

    private String answer;
}
