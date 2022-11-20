package com.example.springjdbc.employee;

import com.example.springjdbc.employee.dao.EmployeeDao;
import com.example.springjdbc.employee.dto.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("employee/config.xml");
        EmployeeDao employeeDao = ctx.getBean("employeeDao", EmployeeDao.class);

        /*Employee employee = new Employee(2, "Bharath", "Thipperedy");
        int result = employeeDao.create(employee);
        System.out.println(result + " rows affected.");*/

        /*Employee employee = new Employee(1, "Josh", "Lang");
        int result = employeeDao.update(employee);
        System.out.println(result + " rows updated.");*/

        int result = employeeDao.delete(2);
        System.out.println(result + " row deleted.");
    }
}
