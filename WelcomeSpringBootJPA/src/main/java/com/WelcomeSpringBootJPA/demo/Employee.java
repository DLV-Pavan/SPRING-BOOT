package com.WelcomeSpringBootJPA.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id; // 1. Added missing import
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eid;
    
    private String ename;
    private int age;
    private double sal;
    public Employee(String ename, int age) {
		//super();
		this.ename = ename;
		this.age = age;
	}
}