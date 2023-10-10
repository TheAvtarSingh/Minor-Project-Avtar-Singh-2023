package org.ncu.hireWheels.controllers;

import org.ncu.hireWheels.entities.Vehicle;
import org.ncu.hireWheels.entities.VehicleUpdateRequest;
import org.ncu.hireWheels.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType; 
import org.springframework.web.bind.annotation.*; 
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/hirewheels/v1")
public class AdminController {
	@Autowired
	AdminService adminService;

//	for adding vehicle data - (AddVehicle Request)
	@PostMapping(value = "/vehicles", consumes = { "application/json" })
	public ResponseEntity<?> addVehicle(@RequestBody Vehicle vehicle) {
	 
		Vehicle addedVehicle = adminService.registerVehicle(vehicle);
		 String errorMessage = "Failed to add vehicle";

		 if (addedVehicle != null) {
		        return new ResponseEntity<>(addedVehicle, HttpStatus.CREATED);
		    } else {
		       
		       return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
		    }
	}
	
//	Updating the Availabilty Status - (UpdateAvailabiltiyStatus Request)
	@PutMapping(value = "/vehicles/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> UpdateVehicle(@PathVariable Integer id,@RequestBody VehicleUpdateRequest requestBody){
		 boolean availabilityUpdated = adminService.changeAvailability(id, requestBody.getAvailabilityStatus());
		 
		 if(availabilityUpdated) {
			 Vehicle updatedVehicle = adminService.getVehicleById(id);
			 return ResponseEntity.status(HttpStatus.ACCEPTED).body(updatedVehicle);
		 }else {
			 return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to update availability. - Check if vehicle Exists");
		 }

	}
	
//	For Adding Mapped Entities Data also - (AddVehicleData (Complete) Request)
	@PostMapping(value = "/addvehicles", consumes = { "application/json" })
	public ResponseEntity<?> newVehicle(@RequestBody Vehicle vehicle){
		Vehicle addedVehicle = adminService.registerVehicle(vehicle);
		
		String errorMessage = "Failed to add";
		
		if(addedVehicle!=null) {
			return new ResponseEntity<>(addedVehicle,HttpStatus.CREATED);
		}
		return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	

}
