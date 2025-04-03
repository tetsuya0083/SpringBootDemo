package com.estsoft.demo.service;

import com.estsoft.demo.repository.Member;
import com.estsoft.demo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

//    //@RequiredArgsConstructor
//    public MemberService(MemberRepository memberRepository) {
//        this.memberRepository = memberRepository;
//    }

    // getMemberAll 멤버 정보 모두 조회
    public List<Member> getMemberAll(){
        return memberRepository.findAll();
    }

    // getMemberById
    public Member getMemberById(Long id){
        Optional<Member> optMember = memberRepository.findById(id);
        //return받는 자료형(Optional)으로 바로 받는 것을 권장.
        return optMember.orElse(new Member());
    }

    // member 테이블에 insert 쿼리
    public Member insertMember(Member member){
        Member saveMember = memberRepository.save(member);
        return saveMember;
    }
    public void deleteMemberById(Long id){
        memberRepository.deleteById(id);
    }



}
