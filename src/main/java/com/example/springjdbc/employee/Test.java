package com.example.springjdbc.employee;

import com.example.springjdbc.employee.dao.EmployeeDao;
import com.example.springjdbc.employee.dto.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("employee/config.xml");
        EmployeeDao employeeDao = ctx.getBean("employeeDao", EmployeeDao.class);
        Employee employee = new Employee(2, "Bharath", "Thipperedy");
        int result = employeeDao.create(employee);
        System.out.println(result + " rows affected.");
    }
}
