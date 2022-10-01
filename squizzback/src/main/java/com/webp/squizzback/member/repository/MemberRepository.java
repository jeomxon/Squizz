package com.webp.squizzback.member.repository;

import com.webp.squizzback.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
}
