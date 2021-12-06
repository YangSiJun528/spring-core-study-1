package com.example.springcore1.member;

import com.example.springcore1.member.Member;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);
}
