package com.Study.StudySpring;

import com.Study.StudySpring.repository.MemberRepository;
import com.Study.StudySpring.repository.MemoryMemberRepository;
import com.Study.StudySpring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

}
