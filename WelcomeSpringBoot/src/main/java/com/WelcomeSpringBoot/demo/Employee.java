package com.WelcomeSpringBoot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
public class Employee {

    @Value("101")
    private int eid;

    @Value("Pavan")
    private String ename;

    @Autowired
    private Department dept;
}