package com.jyoon.study.hellojpa.jpa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MEMBER")
@AllArgsConstructor
@NoArgsConstructor
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
