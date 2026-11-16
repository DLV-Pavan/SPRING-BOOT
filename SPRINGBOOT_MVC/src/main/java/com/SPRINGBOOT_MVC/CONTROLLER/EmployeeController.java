package com.SPRINGBOOT_MVC.CONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Springbootmvc.model.Employee;
import com.Springbootmvc.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService es;

    // CREATE - Display Form
    @GetMapping("/addEmp")
    public String addEmp() {
        return "addEmployee";
    }

    // CREATE - Save Employee
    @PostMapping("/saveEmp")
    public ModelAndView saveEmp(@ModelAttribute Employee emp) {

        es.saveEmployee(emp);

        return new ModelAndView("redirect:/employees/getEmp");
    }

    // READ - Get All Employees
    @GetMapping("/getEmp")
    public ModelAndView getAllEmployee() {

        List<Employee> emps = es.getAllEmployees();

        ModelAndView mv = new ModelAndView();

        mv.addObject("employees", emps);
        mv.setViewName("employeeList");

        return mv;
    }

    // UPDATE - Get Employee By ID
    @GetMapping("/editEmp")
    public ModelAndView editEmp(@RequestParam int eid) {

        Employee emp = es.getEmployeeById(eid);

        ModelAndView mv = new ModelAndView();

        mv.addObject("employee", emp);
        mv.setViewName("editEmployee");

        return mv;
    }

    // UPDATE - Save Employee
    @PostMapping("/updateEmp")
    public ModelAndView updateEmp(@ModelAttribute Employee emp) {

        es.updateEmployee(emp);

        return new ModelAndView("redirect:/employees/getEmp");
    }

    // DELETE - Delete Employee
    @GetMapping("/deleteEmp")
    public ModelAndView deleteEmp(@RequestParam int eid) {

        es.deleteEmployee(eid);

        return new ModelAndView("redirect:/employees/getEmp");
    }
}
