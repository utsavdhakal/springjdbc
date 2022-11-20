package com.example.springjdbc.employee.dao;

import com.example.springjdbc.employee.dto.Employee;

import java.util.List;

public interface EmployeeDao {
    int create(Employee employee);

    int update(Employee employee);

    int delete(int id);

    Employee read(int id);

    List<Employee> read();
}
