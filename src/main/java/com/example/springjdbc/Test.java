package com.example.springjdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "INSERT INTO employee VALUES (?, ?, ?)";
        int result = jdbcTemplate.update(sql, 1, "Dan", "Vega");
        System.out.println(result + " rows affected.");
    }
}
