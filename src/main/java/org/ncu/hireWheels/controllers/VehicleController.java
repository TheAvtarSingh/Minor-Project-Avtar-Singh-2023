package org.ncu.hireWheels.controllers;

import java.util.ArrayList;
import java.util.List;

import org.ncu.hireWheels.entities.Vehicle;
import org.ncu.hireWheels.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hirewheels/v1")
public class VehicleController {
	@Autowired
	VehicleService vehicleService;

	 
	@GetMapping("/vehicles")
	public ResponseEntity<List<Vehicle>> getVehicles(){
		
		 List<Vehicle> list = new ArrayList<>();
		for(Vehicle vehicle : vehicleService.getAllVehicles().values()) {
			list.add(vehicle);
		} 
		return new ResponseEntity<List<Vehicle>>(list, HttpStatus.OK);
	}
	
	/*
	 * @GetMapping(path = "/getAvailableVehicles",consumes = { "application/json" })
	 * public ResponseEntity<List<Vehicle>> getAvailableVehicle(@RequestBody Booking
	 * v){ List<Vehicle> list = new ArrayList<>(); for(Vehicle vehicle :
	 * vehicleService.getAvailableVehicles(v.getBookingVehicle().
	 * getVehicleSubCategory().getVehicleSubCategoryVehicleCategory(),
	 * v.getBookingLocation(), v.getPickupDate(), v.getDropoffDate()).values()) {
	 * list.add(vehicle); } return new ResponseEntity<List<Vehicle>>(list,
	 * HttpStatus.OK); }
	 */

}
