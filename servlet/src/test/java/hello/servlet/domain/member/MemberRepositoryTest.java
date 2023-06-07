package hello.servlet.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;


class MemberRepositoryTest {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    private static Long sequence = 0L;

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

        memberRepository.save(member);

        //then
        assertThat(memberRepository.findById(1L).getUsername()).isEqualTo("지섭");
    }

    @Test
    void findAll() {
        Member member = new Member();
        member.setAge(21);
        member.setUsername("지섭");
    }

}