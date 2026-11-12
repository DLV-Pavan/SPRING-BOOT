package com.WelcomeSpringBootJPA.demo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WelcomeSpringBootJpaApplication implements CommandLineRunner {
    
    private EmployeeService es;
    
    // Constructor Injection
    public WelcomeSpringBootJpaApplication(EmployeeService es) {
        super();
        this.es = es;
    } 

    public static void main(String[] args) {
        SpringApplication.run(WelcomeSpringBootJpaApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("welcome to spring boot application");
        
        // 1. Create a mock Employee object (id is 0 because database auto-increments it)
       //Employee emp = new Employee(0, "DLV PAVAN", 22);
        
        // 2. Call the service layer to insert the employee into MySQL
      //es.AddEmployee(emp);
    
   // Employee emp=es.findByEId(3);
    //System.out.println(emp);
        
        //es.deleteEmp(2);
        //es.updateEmp(2);
        es.transaction(3, 4, 20000);
}
}