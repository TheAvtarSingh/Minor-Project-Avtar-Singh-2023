package org.ncu.hireWheels.controllers;

import org.ncu.hireWheels.entities.Booking; 
import org.ncu.hireWheels.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hirewheels/v1")
public class BookingController {

	@Autowired
	BookingService bookingService;
	
//	Add only Booking specific Data - (BookingVehicle Request)
	@PostMapping(value = "/bookings")
	public ResponseEntity<?> bookVehicle(@RequestBody Booking booking){
		Booking vehicleBooking = bookingService.addBooking(booking);
		String errorMessage = "Failed to book Vehicle";
		
		if(vehicleBooking !=null) {
			 return new ResponseEntity<>(vehicleBooking,HttpStatus.CREATED);
		}else {
			return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
//	Add Complete Data with mappings (BookingDataComplete - Request)
	@PostMapping(value = "/bookVehicle")
        public ResponseEntity<?> addBooking(@RequestBody Booking booking){
		Booking bookedVehicle = bookingService.bookVehicle(booking);

		 String errorMessage = "Failed to book vehicle";
		 
		 if (bookedVehicle!=null) {
			 return new ResponseEntity<>(bookedVehicle,HttpStatus.CREATED);
			
		}else {
			return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
		}
}
	
	
	
}

