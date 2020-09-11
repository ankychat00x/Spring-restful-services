package com.ankita.flightservices.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ankita.flightservices.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
