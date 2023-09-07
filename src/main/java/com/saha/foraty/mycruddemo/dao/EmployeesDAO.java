package com.saha.foraty.mycruddemo.dao;

import com.saha.foraty.mycruddemo.entity.Employee;

import java.util.List;

public interface EmployeesDAO {
    List<Employee> findAll();
    Employee findById(int id);
    List<Employee> findByFirstName(String firstName);

}
