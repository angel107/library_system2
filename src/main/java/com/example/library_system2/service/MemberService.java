package com.example.library_system2.service;

import com.example.library_system2.domain.Member;
import com.example.library_system2.repository.MemberRepository;
;

import java.util.List;
import java.util.Optional;

//순수한 자바코드이기 때문에

public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    /**
     회원 가입
     *
     * @return*/

    public String join(Member member)
    {
//        같은 이름이 있는 중복 회원 받지 않음

        validateDuplicateMember(member);    //중복회원 검증


        memberRepository.save(member);
//        memberRepository에서 save 호출하기
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m->{
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                    /*Optional<Member> result = memberRepository.findByName(member.getName());
                       result.ifPresent(m -> {
                           throw new IllegalStateException("이미 존재하는 회원입니다");
                       });*/
                });
    }
    /**
     * 전체 회원 조회
     * **/
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(String memberId){
        return memberRepository.findById(memberId);
    }
}

