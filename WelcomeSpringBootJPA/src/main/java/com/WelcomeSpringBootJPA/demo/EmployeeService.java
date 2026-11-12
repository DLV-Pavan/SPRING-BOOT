package com.WelcomeSpringBootJPA.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	EmployeeRepository er; // Injecting the repository
	
	public EmployeeService(EmployeeRepository er) {
		
	super();
	this.er=er;
	}
	public void AddEmployee(Employee emp) {
		er.save(emp);
		System.out.println("Saved Employee Object");
	}
	public List<Employee> retriveEmp(){
		List<Employee> emps=er.findAll();
		return emps;
		
	}
	public Employee findByEId(int eid) {
		Employee emp=er.findById(eid).orElseThrow(()->new RuntimeException("employee not found"));
		return emp;
	}
	public void deleteEmp(int eid) {
		Employee emp=findByEId(eid);
		er.delete(emp);
		System.out.println("deleted successfully");
	}
	
	public void updateEmp(int eid) {
		Employee emp=findByEId(eid);
		emp.setEname("Pavan");
		emp.setAge(25);
		er.save(emp);
	}
	
	@Transactional
	public void transaction(int feid, int teid, double amt) {

        Employee semp = findByEId(feid);
        Employee remp = findByEId(teid);

        semp.setSal(semp.getSal() - amt);
        remp.setSal(remp.getSal() + amt);

        er.save(semp);
        er.save(remp);

        System.out.println("Transaction completed");
    }
}