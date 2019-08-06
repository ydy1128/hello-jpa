package com.jyoon.study.hellojpa.service;

import com.jyoon.study.hellojpa.jpa.Member;
import com.jyoon.study.hellojpa.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberRepository memberRepository;

    @Override
    public List<Member> selectMemberList() throws Exception {
        return memberRepository.findAllByOrderByIdDesc();
    }

    @Override
    public void saveMember(Member member) throws Exception {
        memberRepository.save(member);
    }
}
