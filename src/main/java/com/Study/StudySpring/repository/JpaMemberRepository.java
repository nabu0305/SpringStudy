package com.Study.StudySpring.repository;

import com.Study.StudySpring.domain.Member;
import jakarta.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class JpaMemberRepository implements  MemberRepository{

    private final EntityManager em;

    public JpaMemberRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Member save(Member member) {
        em.persist(member);
        return member;
        //Jpa가 인서트 콜이 다 만들어서 db에 집어넣고 id까지 멤버에 set id까지 다 해줌
    }

    @Override
    public Optional<Member> findById(Long id) {
        Member member = em.find(Member.class, id);
        return Optional.ofNullable(member);
    }

    @Override
    public Optional<Member> findByName(String name) {
        List<Member> result = em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();

        return result.stream().findAny();
    }

    @Override
    public List<Member> findAll() {
        //테이블을 대상으로 보통sql을 날리는데 그게아니라 entity를 대상으로 쿼리 날리면 sql로 번역이됨
        //m = 멤버 엔티티 자체를 셀랙트하는것
        return em.createQuery("select m from Member m", Member.class).getResultList();
    }
}
