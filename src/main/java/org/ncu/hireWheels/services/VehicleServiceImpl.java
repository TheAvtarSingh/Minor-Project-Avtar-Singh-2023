package org.ncu.hireWheels.services;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.ncu.hireWheels.entities.Booking;
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
		public Map<Integer, Vehicle> getAvailableVehicles(String pickupLocation, Date pickupDate, Date dropOffDate) {
			List<Vehicle> vehicleList = vehicleRepository.findAll();
			Map<Integer, Vehicle> vehicleMap = new HashMap<Integer, Vehicle>();
			for (Vehicle vehicle : vehicleList) {
				if(vehicle.getAvailabilityStatus() == 1) {
					if (isVehicleAvailableAtLocation(vehicle, pickupLocation)) {
						 
						  if (isVehicleAvailableForDates(vehicle, pickupDate, dropOffDate)) {
							  vehicleMap.put(vehicle.getVehicleId(), vehicle);
		                    }
						
					}
					
				}
			}
			return vehicleMap;
		}

		
		private boolean isVehicleAvailableAtLocation(Vehicle vehicle, String pickupLocation) { 
	        return vehicle.getVehicleLocation().getLocationName().equals(pickupLocation);
	    }
		
		private boolean isVehicleAvailableForDates(Vehicle vehicle, Date pickupDate, Date dropOffDate) {
	      
	        List<Booking> vehicleBookings = vehicle.getVehicle_booking();
	        for (Booking booking : vehicleBookings) {
	            Date bookingPickupDate = booking.getPickupDate();
	            Date bookingDropOffDate = booking.getDropoffDate();

	            if (pickupDate.after(bookingPickupDate) && pickupDate.before(bookingDropOffDate)) {
	                return false; 
	            }

	            if (dropOffDate.after(bookingPickupDate) && dropOffDate.before(bookingDropOffDate)) {
	                return false;  
	            }
	        }

	        return true; 
	    }
		
		 
 

}
