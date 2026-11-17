package com.EmpRestAPI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.EmpRestAPI.model.Employee;
import com.EmpRestAPI.repository.EmpRepo;

@Service
public class EmployeeService {

    private final EmpRepo er;

    public EmployeeService(EmpRepo er) {
        this.er = er;
    }

    public Employee addEmployee(Employee emp) {
        return er.save(emp);
    }

    public List<Employee> getAllEmp() {

        List<Employee> list = er.findAll();

        System.out.println("Total Employees: " + list.size());

        return list;
    }
}