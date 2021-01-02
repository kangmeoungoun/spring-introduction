package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemoryMemberRepositoryTest{

    MemoryMemberRepository repository  =new MemoryMemberRepository();

    @AfterEach
    void afterEach(){
        repository.clearStore();
    }

    @Test
    void save(){
        Member member  = new Member();
        member.setName("spring");
        repository.save(member);
    
        Optional<Member> byId = repository.findById(member.getId());
        Member result = byId.get();
        assertThat(member).isEqualTo(result);
    }

    @Test
    void findByName(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Optional<Member> result = repository.findByName("spring1");
        Member member = result.get();
        assertThat(member).isEqualTo(member1);

        List<Member> result1 = repository.findAll();
        assertThat(result1.size()).isEqualTo(2);
    }
    @Test
    void findAll(){
        Member member1 = new Member();
        member1.setName("spirng1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spirng1");
        repository.save(member2);

        List<Member> result = repository.findAll();
        assertThat(result.size()).isEqualTo(2);
    }


}