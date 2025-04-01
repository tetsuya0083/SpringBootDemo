package com.estsoft.demo.controller;

import com.estsoft.demo.repository.Member;
import com.estsoft.demo.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class MemberController {
    private final MemberService memberService;

    @ResponseBody
    @GetMapping("/members")
    public List<Member> showMembers(){
        return memberService.getMemberAll();
    }
}
