package hello.servlet.domain.member;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    void save() {
        //given
        Member member = new Member("hello", 20);

        //when
        Member savedMember = memberRepository.save(member);

        //then
        Member findMember = memberRepository.findById(savedMember.getId());
        Assertions.assertEquals(findMember, savedMember);
    }

    @Test
    void findAll() {
        //given
        Member member1 = new Member("sujeong", 26);
        Member member2 = new Member("mini", 56);
        memberRepository.save(member1);
        memberRepository.save(member2);

        // when
        List<Member> findList = memberRepository.findAll();

        // then
        Assertions.assertEquals(findList.size(),2);


    }
}