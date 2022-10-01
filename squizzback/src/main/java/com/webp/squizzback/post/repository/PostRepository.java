package com.webp.squizzback.post.repository;

import com.webp.squizzback.post.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
