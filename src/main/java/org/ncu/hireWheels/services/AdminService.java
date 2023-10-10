package org.ncu.hireWheels.services;

import java.util.List;

import org.ncu.hireWheels.entities.User;
import org.ncu.hireWheels.entities.Vehicle;


public interface AdminService  {
// For adding complete data
	public Vehicle addVehicle(Vehicle vehicle);
	
//	For adding just b=vehicle data
	public Vehicle registerVehicle(Vehicle vehicle);

//	Change the availability
	public boolean changeAvailability(Integer id, Integer availabilityStatus);

//	Get vehicle by id
	public Vehicle getVehicleById(Integer id); 
	
//	Add Multiple Vehicles
	public List<Vehicle> addMultipleVehicles(List<Vehicle> vehicles);
	
//	Add Multiple Users
	public List<User> addMultipleUsers(List<User> users);
	 
	
	
}
