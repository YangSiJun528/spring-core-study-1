package com.example.springcore1.discount;

import com.example.springcore1.member.Grade;
import com.example.springcore1.member.Member;
import com.example.springcore1.member.MemberService;
import com.example.springcore1.member.MemberServiceImpl;
import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;


@DisplayName("MemberService 클래스의")
class MemberServiceTest {

    private MemberService memberService = new MemberServiceImpl();

    @DisplayName("join 메소드는")
    @Nested
    class Describe_join {

        @DisplayName("만약 아이디기 중복되지 않은 멤버를 저장할 경우")
        @Nested
        class Context_with_saved_valid_member {

            @DisplayName("회원 정보를 저장한다.")
            @Test
            void join() {
                //given
                Member memberA = new Member(1L, "memberA", Grade.VIP);

                //when
                memberService.join(memberA);
                Member findMember = memberService.findMember(memberA.getId());

                //then
                assertThat(findMember).isEqualTo(findMember);
            }
        }
    }
}