package com.EmpRestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.EmpRestAPI.model.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}