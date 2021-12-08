package com.omd.myapp.service;

import com.omd.myapp.model.Employee;
import com.omd.myapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public String postEmployee(Employee emp) {
      if (employeeRepository.existsById(emp.getEmployeeId())){
          return "Id Already Present";
      }
       employeeRepository.save(emp);
      return "Employee details saved !";
    }

    @Override
    public String deleteEmployee(Long id) {
         employeeRepository.deleteById((long) id);
         return "Employee Deleted !!!"+id;
    }

    @Override
    public String updateEmployee(Employee emp) {
        Boolean temp=false;
        if(emp.getEmployeeName()!=null && emp.getEmployeeName().length()!=0){
            temp=true;
        }

        if(temp){
            employeeRepository.save(emp);
            return "Employee Updated Successfully!!!";
        }
        else{
            return "PLz provide suitable output!!!";
        }
    }
}
