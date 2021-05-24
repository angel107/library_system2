package com.example.library_system2.repository;

import com.example.library_system2.domain.Member;

import javax.swing.*;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); // 회원이 저장소에 저장됨(아직 DB설정하지 않아서 메모리에 저장됨)
    // 아래 두 find기능은 저장된 회원 찾기 기능
    Optional<Member> findById(String id); //id로 회원찾기
    Optional<Member> findByName(String name);
    //Optional이란, Id,Name을 찾고자했는데 NULL일 수 있음. 그때 optional로 감싸서 반환해줌!
    List<Member> findAll(); // 여태까지 저장된 모든 회원들을 리스트로 반환.

}
