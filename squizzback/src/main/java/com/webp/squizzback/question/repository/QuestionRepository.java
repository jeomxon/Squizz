package com.webp.squizzback.question.repository;

import com.webp.squizzback.question.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
