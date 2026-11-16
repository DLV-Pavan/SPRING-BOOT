package com.Springbootmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springbootmvc.model.Employee;
import com.Springbootmvc.repo.EmployeeRepo;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo er;

    // CREATE
    public Employee saveEmployee(Employee emp) {
        return er.save(emp);
    }

    // READ - Get All Employees
    public List<Employee> getAllEmployees() {
        return er.findAll();
    }

    // READ - Get Employee By ID
    public Employee getEmployeeById(int eid) {
        return er.findById(eid).orElse(null);
    }

    // UPDATE
    public Employee updateEmployee(Employee emp) {
        return er.save(emp);
    }

    // DELETE
    public void deleteEmployee(int eid) {
        er.deleteById(eid);
    }
}
