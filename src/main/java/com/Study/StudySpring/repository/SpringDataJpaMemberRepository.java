package com.Study.StudySpring.repository;

import com.Study.StudySpring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//인터페이스가 인터페이스를 받을 때는 Extend라고 합니다.
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    @Override
    Optional<Member> findByName(String name);
}
