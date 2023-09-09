package com.saha.foraty.mycruddemo.dao;

import com.saha.foraty.mycruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
