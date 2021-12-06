package com.example.springcore1.service;

import com.example.springcore1.domain.Member;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);
}
