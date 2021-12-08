package com.omd.myapp.service;

import com.omd.myapp.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();
    String postEmployee(Employee emp);

    String deleteEmployee(Long id);
    String updateEmployee(Employee emp);

    //boolean checkLastId();
}
