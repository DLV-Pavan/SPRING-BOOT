
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

    // Add Employee
    public Employee addEmployee(Employee emp) {
        return er.save(emp);
    }

    // Get All Employees
    public List<Employee> getAllEmp() {
        return er.findAll();
    }

    // Get Employee By ID
    public Employee getEmpById(int eid) {
        return er.findById(eid).orElse(null);
    }

    // Delete Employee
    public boolean deleteId(int eid) {

        if (er.existsById(eid)) {
            er.deleteById(eid);
            return true;
        }

        return false;
    }

    // Update Employee
    public Employee updateEmp(Employee emp, int eid) {

        Employee existingEmp = er.findById(eid).orElse(null);

        if (existingEmp != null) {
            existingEmp.setEname(emp.getEname());
            return er.save(existingEmp);
        }

        return null;
    }
    
    public Employee patchEmp(Employee emp, int eid) {

        Employee existingEmp = er.findById(eid).orElse(null);

        if (existingEmp != null) {

            if (emp.getEname() != null) {
                existingEmp.setEname(emp.getEname());
            }

            return er.save(existingEmp);
        }

        return null;
    }
}
