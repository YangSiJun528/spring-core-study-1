package com.example.springcore1.repository;

import com.example.springcore1.domain.Member;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);
}
