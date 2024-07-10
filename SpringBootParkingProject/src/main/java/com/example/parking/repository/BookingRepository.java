package com.example.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.parking.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long>{

}
