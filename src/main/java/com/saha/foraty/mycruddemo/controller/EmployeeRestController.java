package com.saha.foraty.mycruddemo.controller;

import com.saha.foraty.mycruddemo.dao.EmployeesDAO;
import com.saha.foraty.mycruddemo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    //TODO : Remove later on.
    private final EmployeesDAO employeesDAO;

    public EmployeeRestController(EmployeesDAO employeesDAO) {
        this.employeesDAO = employeesDAO;
    }

    @GetMapping("/employees")
    List<Employee> getEmployees(){
        return employeesDAO.findAll();
    }
}
