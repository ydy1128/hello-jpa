package com.jyoon.study.hellojpa.service;

import com.jyoon.study.hellojpa.jpa.Member;

import java.util.List;

public interface MemberService {
    List<Member> selectMemberList() throws Exception;
    void saveMember(Member member) throws Exception;
}
