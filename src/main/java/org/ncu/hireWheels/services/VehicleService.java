package org.ncu.hireWheels.services;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.ncu.hireWheels.entities.Location;
import org.ncu.hireWheels.entities.Vehicle;
import org.ncu.hireWheels.entities.VehicleCategory;

public interface VehicleService {
	public List<Vehicle> getVehicles();
	public Map<Integer, Vehicle> getAllVehicles();
	public Map<Integer, Vehicle> getAvailableVehicles(VehicleCategory category, Location pickupLocation, Date pickupDateTime, Date dropoffDateTime);
}
