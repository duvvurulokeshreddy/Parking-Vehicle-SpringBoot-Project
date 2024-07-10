package com.example.parking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.parking.model.ParkingSlot;
import com.example.parking.repository.ParkingSlotRepository;

@Service
public class ParkingSlotService    {
	
	@Autowired
    private ParkingSlotRepository parkingSlotRepository;

    public List<ParkingSlot> findAll() {
        return parkingSlotRepository.findAll();
    }

    public ParkingSlot save(ParkingSlot slot) {
        return parkingSlotRepository.save(slot);
    }
	
}