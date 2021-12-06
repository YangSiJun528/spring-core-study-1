package com.example.springcore1.member;

import com.example.springcore1.member.Member;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);
}
