package com.omd.myapp.controller;

import com.omd.myapp.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeViewController {

    Logger logger = LoggerFactory.getLogger(EmployeeViewController.class);
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee-manage")
    public ModelAndView empPage(){
        logger.error("Fatal ERROR");
        logger.info("View Controller Called Successfully!");
        ModelAndView mv=new ModelAndView();
        mv.setViewName("employee");
        Object employee= employeeService.getAllEmployee();
        mv.addObject("employees",employee);
        return mv;
    }
}
