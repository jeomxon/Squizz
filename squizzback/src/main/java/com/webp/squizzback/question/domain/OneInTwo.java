package com.webp.squizzback.question.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@DiscriminatorValue("TWO")
public class OneInTwo extends Question {

    private boolean answer;
}
