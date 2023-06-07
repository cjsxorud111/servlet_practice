package hello.servlet.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;


class MemberRepositoryTest {

    private static Map<Long, Member> store = new HashMap<>();
    private static Long sequence = 0L;
    @Test
    void save() {
        //given
        Member member = new Member();
        member.setAge(21);
        member.setUsername("지섭");

        //when
        member.setId(++sequence);
        store.put(member.getId(), member);

        //then
        assertThat(store.get(1L).getUsername()).isEqualTo("지섭");
    }



}