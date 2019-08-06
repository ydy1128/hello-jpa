package com.jyoon.study.hellojpa.controller;

import com.jyoon.study.hellojpa.jpa.Member;
import com.jyoon.study.hellojpa.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping(name="/member/list", produces="application/json")
    @ResponseBody
    public String getBoardList() throws Exception {
        List<Member> list = memberService.selectMemberList();
        return list.toString();
    }
}
