package com.example.springcore1.service;

import com.example.springcore1.domain.Member;
import com.example.springcore1.repository.MemberRepository;
import com.example.springcore1.repository.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
