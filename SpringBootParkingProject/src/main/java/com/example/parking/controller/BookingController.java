package com.example.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.parking.model.Booking;
import com.example.parking.service.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {

	@Autowired
    private BookingService bookingService;

    @PostMapping("/bookes")
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }
	
}
