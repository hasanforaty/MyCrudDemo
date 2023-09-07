package com.saha.foraty.mycruddemo.controller;

import com.saha.foraty.mycruddemo.entity.Employee;
import com.saha.foraty.mycruddemo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/employees/{employeeId}")
    Employee getEmployeeById(@PathVariable int employeeId){
        Employee theEmployee = employeeService.findById(employeeId);
        if(theEmployee==null){
            throw new RuntimeException("Employee id not found-"+employeeId);
        }
        return theEmployee;
    }

    @PostMapping("/employees")
    Employee addEmployee(@RequestBody Employee theEmployee){
        //make sure the employee is new one so it create new Employee
        theEmployee.setId(0);
        return employeeService.save(theEmployee);
    }

    @PutMapping("/employees")
    Employee updateEmployee(@RequestBody Employee updatedEmployee){
        return  employeeService.save(updatedEmployee);
    }

    @DeleteMapping("/employees/{employeeId}")
    String  deleteEmployee(@PathVariable int employeeId){
        Employee tempEmployee = employeeService.findById(employeeId);
        if(tempEmployee==null){
            throw new RuntimeException("Employee is not found - "+employeeId);
        }
        employeeService.deleteById(employeeId);
        return "success";
    }



}
