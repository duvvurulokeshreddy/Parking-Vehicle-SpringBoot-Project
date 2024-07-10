package com.example.parking.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.parking.model.ParkingSlot;


public interface ParkingSlotRepository  extends JpaRepository<ParkingSlot, Long> {

	

	
}
