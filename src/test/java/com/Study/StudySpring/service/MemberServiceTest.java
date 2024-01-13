package com.Study.StudySpring.service;

import com.Study.StudySpring.domain.Member;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Optional;


class MemberServiceTest {

    MemberService memberService = new MemberService();


    @Test
    void 회원가입() {
        //given
        Member member = new Member();
        member.setName("hello");

        //when
        Long saveId = memberService.join(member);

        //then
       Member findMember = memberService.findOne(saveId).get();
       assertThat(member.getName()).isEqualTo(findMember.getName());

    }

    @Test
    public void 중복_회원_예외() {
        // Given
        Member member1 = new Member();
        member1.setName("spring");
        Member member2 = new Member();
        member2.setName("spring");

        // When
        memberService.join(member1);

        // Then
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));  // 예외 타입 변경
        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
    }
    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}