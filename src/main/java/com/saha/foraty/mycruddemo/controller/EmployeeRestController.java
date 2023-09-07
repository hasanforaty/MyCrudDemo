package com.saha.foraty.mycruddemo.controller;

import com.saha.foraty.mycruddemo.entity.Employee;
import com.saha.foraty.mycruddemo.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private final EmployeeService employeeService;

    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    List<Employee> getEmployees(){
        return employeeService.findAll();
    }
}
