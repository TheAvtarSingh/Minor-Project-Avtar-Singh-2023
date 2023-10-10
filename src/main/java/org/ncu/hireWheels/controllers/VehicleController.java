package org.ncu.hireWheels.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.ncu.hireWheels.entities.Vehicle;
import org.ncu.hireWheels.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hirewheels/v1")
public class VehicleController {
	@Autowired
	VehicleService vehicleService;

	@GetMapping("/vehicles")
	public ResponseEntity<List<Vehicle>> getVehicles() {

		List<Vehicle> list = new ArrayList<>();
		for (Vehicle vehicle : vehicleService.getAllVehicles().values()) {
			list.add(vehicle);
		}
		return new ResponseEntity<List<Vehicle>>(list, HttpStatus.OK);
	}

	@GetMapping(path = "/getAvailableVehicles")
	public ResponseEntity<?> getAvailableVehicle(@RequestBody Map<String, String> request) {
		 try {
			 String pickUpLocation = request.get("pickupLocation");
		        String pickupDateStr = request.get("pickupDate");
		        String dropOffDateStr = request.get("dropOffDate");

		        Date pickupDate = Date.valueOf(pickupDateStr);
		        Date dropOffDate = Date.valueOf(dropOffDateStr);

		        List<Vehicle> list = new ArrayList<>();
		        for (Vehicle vehicle : vehicleService.getAvailableVehicles(pickUpLocation, pickupDate, dropOffDate).values()) {
		            list.add(vehicle);
		        }
		        if (list.isEmpty()) {
					return new ResponseEntity<>("No Vehicles Available for Given Data !!", HttpStatus.OK);
				}
		        return new ResponseEntity<List<Vehicle>>(list, HttpStatus.OK);
		    } catch (IllegalArgumentException e) {
		        // Handle invalid date format or other exceptions here
		        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		    }
	}

}
