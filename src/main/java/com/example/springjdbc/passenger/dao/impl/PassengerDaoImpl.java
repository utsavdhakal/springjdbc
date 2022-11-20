package com.example.springjdbc.passenger.dao.impl;

import com.example.springjdbc.passenger.dao.PassengerDao;
import com.example.springjdbc.passenger.dto.Passenger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("passengerDao")
public class PassengerDaoImpl implements PassengerDao {

    private final JdbcTemplate jdbcTemplate;
    
    private final RowMapper<Passenger> mapper;

    public PassengerDaoImpl(JdbcTemplate jdbcTemplate, RowMapper<Passenger> mapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.mapper = mapper;
    }

    @Override
    public int create(Passenger passenger) {
        String sql = "insert into passenger values (?, ? , ?)";
        return jdbcTemplate.update(sql, passenger.getId(), passenger.getFirstName(), passenger.getLastName());
    }

    @Override
    public int update(Passenger passenger) {
        String sql = "update passenger set first_name=?, last_name=? where id=?";
        return jdbcTemplate.update(sql, passenger.getFirstName(), passenger.getLastName(), passenger.getId());
    }

    @Override
    public int delete(int id) {
        String sql = "delete from passenger where id=?";
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public Passenger read(int id) {
        String sql = "select * from passenger where id=?";
        return jdbcTemplate.queryForObject(sql, mapper, id);
    }

    @Override
    public List<Passenger> read() {
        String sql = "select * from passenger";
        return jdbcTemplate.query(sql, mapper);
    }
}
