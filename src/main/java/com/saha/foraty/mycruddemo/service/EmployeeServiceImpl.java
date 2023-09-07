package com.saha.foraty.mycruddemo.service;

import com.saha.foraty.mycruddemo.dao.EmployeesDAO;
import com.saha.foraty.mycruddemo.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    public Employee findById(int id) {
        return employeesDAO.findById(id);
    }

    @Override
    public List<Employee> findByFirstName(String firstName) {
        return employeesDAO.findByFirstName(firstName);
    }

    @Override
    @Transactional
    public Employee save(Employee theEmployee) {
        return employeesDAO.save(theEmployee);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        employeesDAO.deleteById(theId);
    }
}
