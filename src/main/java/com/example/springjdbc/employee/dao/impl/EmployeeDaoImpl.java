package com.example.springjdbc.employee.dao.impl;

import com.example.springjdbc.employee.dao.EmployeeDao;
import com.example.springjdbc.employee.dto.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao {

    private JdbcTemplate jdbcTemplate;
    @Override
    public int create(Employee employee) {
        String sql = "INSERT INTO employee VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
    }

    @Override
    public int update(Employee employee) {
        String sql = "UPDATE employee SET first_name=?, last_name=? where id=?";
        return jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
    }

    @Override
    public int delete(int id) {
        String sql = "DELETE FROM employee WHERE id=?";
        return jdbcTemplate.update(sql, id);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
