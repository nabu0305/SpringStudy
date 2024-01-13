package com.Study.StudySpring.service;

import com.Study.StudySpring.domain.Member;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import com.Study.StudySpring.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;


class MemberServiceTest {

    MemberService memberService;
    MemoryMemberRepository memberRepository;

    //Dependency Injection DI
    @BeforeEach
    public void beforeEach(){
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService(memberRepository);
    }

    @AfterEach
    public void afterEach(){
        memberRepository.clearStore();
    }
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