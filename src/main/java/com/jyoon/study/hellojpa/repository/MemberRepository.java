package com.jyoon.study.hellojpa.repository;

import com.jyoon.study.hellojpa.jpa.Member;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MemberRepository extends CrudRepository<Member, Integer> {
    List<Member> findAllByOrderByIdDesc();
}
