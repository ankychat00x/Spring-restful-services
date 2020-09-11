package com.ankita.flightservices.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ankita.flightservices.entities.Reservation;


public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
