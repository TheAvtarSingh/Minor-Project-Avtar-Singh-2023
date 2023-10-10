package org.ncu.hireWheels.services;

import org.ncu.hireWheels.entities.FuelType;
import org.ncu.hireWheels.entities.Location;
import org.ncu.hireWheels.entities.Vehicle;
import org.ncu.hireWheels.entities.VehicleSubCategory;
import org.ncu.hireWheels.repository.FuelTypeRepository;
import org.ncu.hireWheels.repository.LocationRepository;
import org.ncu.hireWheels.repository.VehicleRepository;
import org.ncu.hireWheels.repository.VehicleSubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 

@Service
public class AdminServiceImpl implements AdminService {
	
 
	
	@Autowired
	VehicleRepository vehicleRepository;
	
	@Autowired
	VehicleSubCategoryRepository vehicleSubCategoryRepository;
	@Autowired
	FuelTypeRepository fuelTypeRepository;
	@Autowired
	LocationRepository locationRepository;

	@Override
	
	public Vehicle addVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		Vehicle v = vehicleRepository.save(vehicle);
		if(v==null) {
			return new Vehicle();
		}
		return v;
	}

	@Override
	public boolean changeAvailability(Integer id, Integer availabilityStatus) {
		// TODO Auto-generated method stub
	Vehicle vehicle = vehicleRepository.findById(id).orElse(null);
	if(vehicle!=null) {
		vehicle.setAvailabilityStatus(availabilityStatus);
		vehicleRepository.save(vehicle);
		return true;
	}
		return false;
	}

	@Override
	public Vehicle getVehicleById(Integer id) {
		return vehicleRepository.findById(id).orElse(null);
		
	}
	
	

	@Override
	public Vehicle registerVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		VehicleSubCategory vSubCategory = vehicleSubCategoryRepository.findById(vehicle.getVehicleSubCategory().getVehicleSubCategoryId()).orElse(null);
		FuelType vfuelType = fuelTypeRepository.findById(vehicle.getVehicleFuelType().getFuelTypeId()).orElse(null);
		Location vlocation = locationRepository.findById(vehicle.getVehicleLocation().getLocationId()).orElse(null);
		
		if (vSubCategory == null || vfuelType == null || vlocation == null) {
	        return null; // Return null if any of the required entities is not found
	    } else {
	        // Set the associations
	        vehicle.setVehicleSubCategory(vSubCategory);
	        vehicle.setVehicleFuelType(vfuelType);
	        vehicle.setVehicleLocation(vlocation);

	        // Save the vehicle
	        Vehicle savedVehicle = vehicleRepository.save(vehicle);
	        return savedVehicle;
	    }
		
	}
	
	
	


}
