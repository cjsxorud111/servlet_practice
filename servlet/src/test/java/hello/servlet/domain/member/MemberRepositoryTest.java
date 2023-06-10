package hello.servlet.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

class MemberRepositoryTest {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    void save() {
        //given
        Member member = new Member();
        member.setAge(21);
        member.setUsername("지섭");

        //when
        Member m = memberRepository.save(member);

        //then
        assertThat(memberRepository.findById(1L).getUsername()).isEqualTo("지섭");
    }

    @Test
    void findAll() {
        //given
        Member member = new Member();
        member.setAge(21);
        member.setUsername("송지섭");
        memberRepository.save(member);
        Member member1 = new Member();
        member1.setAge(23);
        member1.setUsername("박재형");
        memberRepository.save(member1);

        //when
        List<Member> members = memberRepository.findAll();

        //then
        assertThat(members.get(0).getUsername()).isEqualTo("지섭");
        assertThat(members.get(1).getUsername()).isEqualTo("재형");

    }

}