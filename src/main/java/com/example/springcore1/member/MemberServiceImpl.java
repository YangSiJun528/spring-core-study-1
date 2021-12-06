package com.example.springcore1.member;

import com.example.springcore1.member.Member;
import com.example.springcore1.member.MemberRepository;
import com.example.springcore1.member.MemberService;
import com.example.springcore1.member.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService {
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
