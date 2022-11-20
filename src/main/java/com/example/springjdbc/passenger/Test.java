package com.example.springjdbc.passenger;

import com.example.springjdbc.passenger.dao.PassengerDao;
import com.example.springjdbc.passenger.dto.Passenger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("passenger/config.xml");
        PassengerDao passengerDao = ctx.getBean("passengerDao", PassengerDao.class);

        /*Passenger passenger = new Passenger(2, "Tom", "Jerry");
        int result = passengerDao.create(passenger);
        System.out.println(result + " row added.");*/

        /*Passenger passenger = new Passenger(2, "Tom", "Tom");
        int result = passengerDao.update(passenger);
        System.out.println(result + " row updated.");*/

        /*int result = passengerDao.delete(2);
        System.out.println(result + " row deleted.");*/

        /*Passenger passenger = passengerDao.read(1);
        System.out.println(passenger);*/

        List<Passenger> passengers = passengerDao.read();
        for (Passenger passenger : passengers) {
            System.out.println(passenger);
        }
    }
}
