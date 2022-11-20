package com.example.springjdbc.employee.dao.impl;

import com.example.springjdbc.employee.dao.EmployeeDao;
import com.example.springjdbc.employee.dto.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao {

    private JdbcTemplate jdbcTemplate;
    @Override
    public int create(Employee employee) {
        String sql = "INSERT INTO employee VALUES (?, ?, ?)";
        int id = employee.getId();
        String firstName = employee.getFirstName();
        String lastName = employee.getLastName();
        return jdbcTemplate.update(sql, id, firstName, lastName);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
