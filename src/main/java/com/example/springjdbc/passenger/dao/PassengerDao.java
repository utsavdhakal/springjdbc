package com.example.springjdbc.passenger.dao;

import com.example.springjdbc.passenger.dto.Passenger;

import java.util.List;

public interface PassengerDao {
    int create(Passenger passenger);

    int update(Passenger passenger);

    int delete(int id);

    Passenger read(int id);

    List<Passenger> read();
}
