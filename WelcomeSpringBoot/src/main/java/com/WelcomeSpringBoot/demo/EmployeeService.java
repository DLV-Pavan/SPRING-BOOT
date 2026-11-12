package com.WelcomeSpringBoot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    @Autowired
    private Employee emp;

    public Employee getEmp() {
        return emp;
    }
}
