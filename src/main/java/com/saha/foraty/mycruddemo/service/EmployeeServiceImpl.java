package com.saha.foraty.mycruddemo.service;

import com.saha.foraty.mycruddemo.dao.EmployeesDAO;
import com.saha.foraty.mycruddemo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeesDAO employeesDAO;

    public EmployeeServiceImpl(EmployeesDAO employeesDAO) {
        this.employeesDAO = employeesDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeesDAO.findAll();
    }
}
