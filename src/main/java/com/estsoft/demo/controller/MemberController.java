package com.estsoft.demo.controller;

import com.estsoft.demo.repository.Member;
import com.estsoft.demo.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.json.JsonWriter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Controller
public class MemberController {
    private final MemberService memberService;

    @ResponseBody
    @GetMapping("/members")
    public List<Member> showMembers(){
        return memberService.getMemberAll();
    }

    @ResponseBody
    @PostMapping("/members")
    public Member saveMember(@RequestBody Member member){
        return memberService.insertMember(member);
    }

    // GET /members/{id} -> member 단건 조회
    @ResponseBody
    @GetMapping("/members/{id}")
    public Member getMemberById(@PathVariable long id){
        return memberService.getMemberById(id);
    }

    // DELETE /members/{id}
    @ResponseBody
    @DeleteMapping("members/{id}")
    public void deleteMemberById(@PathVariable long id){
        memberService.deleteMemberById(id);
    }








}
