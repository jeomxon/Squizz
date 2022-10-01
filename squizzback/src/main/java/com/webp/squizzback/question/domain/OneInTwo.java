package com.webp.squizzback.question.domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue("TWO")
public class OneInTwo extends Question {

    private boolean answer;
}
