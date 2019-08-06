package com.jyoon.study.hellojpa.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MEMBER")
public class Member {
    @Id
    @Getter @Setter
    private String id;
    @Getter @Setter
    private String username;
    @Getter @Setter
    private Integer age;

    @Override
    public String toString() {
        return "Member[id="+id+", username="+username+", age="+age+"]";
    }
}
