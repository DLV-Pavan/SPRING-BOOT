package com.WelcomeSpringBoot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WelcomeSpringBootApplication {

	public static void main(String[] args) {

	    ApplicationContext context =
	        SpringApplication.run(WelcomeSpringBootApplication.class, args);

	    System.out.println("Welcome to Spring Boot Application");

	    EmployeeService emps =
	        context.getBean(EmployeeService.class);

	    Employee emp = emps.getEmp();

	    System.out.println(emp.getEid());
	    System.out.println(emp.getEname());
	    System.out.println(emp.getDept());
	}
}