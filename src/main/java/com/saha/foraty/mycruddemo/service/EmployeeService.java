package com.saha.foraty.mycruddemo.service;

import com.saha.foraty.mycruddemo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee theEmployee);
    void deleteById(int theId);


}
