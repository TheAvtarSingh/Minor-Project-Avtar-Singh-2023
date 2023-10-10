package org.ncu.hireWheels.services;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.ncu.hireWheels.entities.Vehicle;

public interface VehicleService {
	public List<Vehicle> getVehicles();
	public Map<Integer, Vehicle> getAllVehicles();
	public Map<Integer, Vehicle> getAvailableVehicles(String pickupLocation, Date pickupDate, Date dropOffDate);
}
