package com.example.parking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.parking.model.ParkingSlot;
import com.example.parking.service.ParkingSlotService;

@RestController
@RequestMapping("/slots")
public class ParkingSlotController  {
	
	 @Autowired
	    private ParkingSlotService parkingSlotService;

	    @GetMapping("/parkingslot")
	    public List<ParkingSlot> getAllSlots() {
	        return parkingSlotService.findAll();
	    }

	    @PostMapping("/parkings")
	    public ParkingSlot createSlot(@RequestBody ParkingSlot slot) {
	        return parkingSlotService.save(slot);
	    }

}
