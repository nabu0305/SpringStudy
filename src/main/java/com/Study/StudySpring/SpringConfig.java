package com.Study.StudySpring;

import com.Study.StudySpring.repository.JdbcMemberRepository;
import com.Study.StudySpring.repository.JdbcTemplateMemberRepository;
import com.Study.StudySpring.repository.MemberRepository;
import com.Study.StudySpring.repository.MemoryMemberRepository;
import com.Study.StudySpring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {
    private final DataSource dataSource;
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
// return new MemoryMemberRepository();
//        return new JdbcMemberRepository(dataSource);
        return new JdbcTemplateMemberRepository(dataSource);
    }
}
