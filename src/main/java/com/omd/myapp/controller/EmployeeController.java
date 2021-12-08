package com.omd.myapp.controller;

import com.omd.myapp.model.Employee;
import com.omd.myapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @PostMapping("/employee")
    public String postEmployee( Employee emp){
        return employeeService.postEmployee(emp);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable("id") Long id){
        return employeeService.deleteEmployee(id);
    }

    @PutMapping("/employee")
    public String updateEmployee(Employee emp){
        return employeeService.updateEmployee(emp);
    }
}
