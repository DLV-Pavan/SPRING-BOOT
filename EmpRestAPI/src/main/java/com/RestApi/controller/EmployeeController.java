
package com.RestApi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.EmpRestAPI.model.Employee;
import com.EmpRestAPI.service.EmployeeService;

import org.springframework.web.bind.annotation.PatchMapping;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    private final EmployeeService es;

    public EmployeeController(EmployeeService es) {
        this.es = es;
    }

    // POST - Add Employee
    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp) {

        Employee savedEmp = es.addEmployee(emp);

        return new ResponseEntity<>(savedEmp, HttpStatus.CREATED);
    }

    // GET - Get All Employees
    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmp() {

        List<Employee> list = es.getAllEmp();

        if (list.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(list);
    }

    // GET - Get Employee By ID
    @GetMapping("/{eid}")
    public ResponseEntity<Employee> getEmpById(@PathVariable int eid) {

        Employee emp = es.getEmpById(eid);

        if (emp != null) {
            return ResponseEntity.ok(emp);
        }

        return ResponseEntity.notFound().build();
    }

    // DELETE - Delete Employee
    @DeleteMapping("/{eid}")
    public ResponseEntity<String> deleteEmpId(@PathVariable int eid) {

        boolean deleted = es.deleteId(eid);

        if (deleted) {
            return ResponseEntity.ok("Employee deleted successfully");
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Employee not found with ID: " + eid);
    }

    // PUT - Update Employee
    @PutMapping("/{eid}")
    public ResponseEntity<?> updateEmp(
            @RequestBody Employee emp,
            @PathVariable int eid) {

        Employee uemp = es.updateEmp(emp, eid);

        if (uemp != null) {
            return ResponseEntity.ok(uemp);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Employee not found with ID: " + eid);
    }
    
    
    @PatchMapping("/{eid}")
    public ResponseEntity<?> patchEmp(
            @RequestBody Employee emp,
            @PathVariable int eid) {

        Employee uemp = es.patchEmp(emp, eid);

        if (uemp != null) {
            return ResponseEntity.ok(uemp);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Employee not found with ID: " + eid);
    }
}
