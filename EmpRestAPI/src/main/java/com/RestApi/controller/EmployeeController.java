package com.RestApi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmpRestAPI.model.Employee;
import com.EmpRestAPI.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    private final EmployeeService es;

    public EmployeeController(EmployeeService es) {
        this.es = es;
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee emp) {
        return es.addEmployee(emp);
    }

    @GetMapping
    public List<Employee> getAllEmp() {
        return es.getAllEmp();
    }
}
