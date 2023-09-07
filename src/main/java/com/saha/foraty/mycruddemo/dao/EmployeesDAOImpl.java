package com.saha.foraty.mycruddemo.dao;

import com.saha.foraty.mycruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class EmployeesDAOImpl implements EmployeesDAO {
    private final EntityManager entityManager;

    public EmployeesDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> query = entityManager.createQuery("from Employee",Employee.class);

        return query.getResultList();
    }

    @Override
    public Employee findById(int id) {
        return entityManager.find(Employee.class,id);
    }

    @Override
    public List<Employee> findByFirstName(String firstName) {
        TypedQuery<Employee> query = entityManager.createQuery("from Employee where firstName=:argument", Employee.class);
        query.setParameter("argument",firstName);
        return query.getResultList();
    }

}