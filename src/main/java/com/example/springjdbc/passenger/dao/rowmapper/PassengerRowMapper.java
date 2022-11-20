package com.example.springjdbc.passenger.dao.rowmapper;


import com.example.springjdbc.passenger.dto.Passenger;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class PassengerRowMapper implements RowMapper<Passenger> {

    @Override
    public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
        int id = rs.getInt("id");
        String first_name = rs.getString("first_name");
        String last_name = rs.getString("last_name");
        return new Passenger(id, first_name, last_name);
    }
}
