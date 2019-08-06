package com.jyoon.study.hellojpa.controller;

import com.jyoon.study.hellojpa.jpa.Member;
import com.jyoon.study.hellojpa.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Slf4j
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping(name="/member/list", produces="application/json")
    @ResponseBody
    public String getMemberList() throws Exception {
        List<Member> list = memberService.selectMemberList();
        return list.toString();
    }

    @GetMapping("/member/create")
    @ResponseBody
    public String createMember() throws Exception {
        List<Member> list = memberService.selectMemberList();
        int size = list.size();

        Member member = new Member(""+size, "NewMember"+size, 20);
        memberService.saveMember(member);
        return member.toString();
    }
}
