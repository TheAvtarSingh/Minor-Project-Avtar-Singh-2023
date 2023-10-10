package org.ncu.hireWheels.services;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.ncu.hireWheels.entities.Location;
import org.ncu.hireWheels.entities.Vehicle;
import org.ncu.hireWheels.entities.VehicleCategory;
import org.ncu.hireWheels.repository.BookingRepository;
import org.ncu.hireWheels.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {
    	@Autowired
	    VehicleRepository vehicleRepository;
    	
    	@Autowired
    	BookingRepository bookingRepository;
 
    	 @Override
    	    public List<Vehicle> getVehicles() { 
    	        return vehicleRepository.findAll();
    	    }

		@Override
		public Map<Integer, Vehicle> getAllVehicles() {
			List<Vehicle> vehicleList = vehicleRepository.findAll();
			Map<Integer, Vehicle> vehicleMap = new HashMap<Integer, Vehicle>();
			for (Vehicle vehicle : vehicleList) {
				vehicleMap.put(vehicle.getVehicleId(), vehicle);
			}
			return vehicleMap;
		}

		@Override
		public Map<Integer, Vehicle> getAvailableVehicles(VehicleCategory category, Location pickupLocation,
				Date pickupDate, Date dropoffDate) {
			// TODO Auto-generated method stub
			/*
			 * List<Vehicle> vehicleList = vehicleRepository.findByCategory(category);
			 * Map<Integer, Vehicle> availableVehicles = new HashMap<>(); for(Vehicle
			 * vehicle : vehicleList) { if(vehicle.getAvailabilityStatus() ==1) {
			 * if(isVehicleAvailableAtLocation(vehicle, pickupLocation)) {
			 * if(isVehicleAvailableForThatTime(vehicle, pickupDate, dropoffDate)) {
			 * availableVehicles.put(vehicle.getVehicleId(), vehicle); } } } } return
			 * availableVehicles;
			 */
			return null;
		}
		
		
		private boolean isVehicleAvailableAtLocation(Vehicle vehicle, Location location) {
		return vehicle.getVehicleLocation().getLocationId() == location.getLocationId();
		     
		}
		
		/*
		 * private boolean isVehicleAvailableForThatTime(Vehicle vehicle, Date
		 * pickupDate, Date dropoffDate) { List<Booking> bookings =
		 * bookingRepository.findBookingsForVehicleAndDates(vehicle, pickupDate,
		 * dropoffDate);
		 * 
		 * // Check if there are any conflicting bookings for the vehicle during the
		 * specified time period for (Booking booking : bookings) { if
		 * (isDateRangeOverlap(pickupDate, dropoffDate, booking.getPickupDate(),
		 * booking.getDropoffDate())) { // If there is an overlap in date ranges, the
		 * vehicle is not available return false; } }
		 * 
		 * // If no conflicting bookings were found, the vehicle is available return
		 * true; }
		 * 
		 * // Helper function to check if two date ranges overlap private boolean
		 * isDateRangeOverlap(Date start1, Date end1, Date start2, Date end2) { return
		 * start1.before(end2) && start2.before(end1); }
		 */


		 
 

}
