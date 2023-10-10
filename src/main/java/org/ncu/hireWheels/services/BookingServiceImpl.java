package org.ncu.hireWheels.services;

import org.ncu.hireWheels.entities.Booking;
import org.ncu.hireWheels.entities.Location;
import org.ncu.hireWheels.entities.User;
import org.ncu.hireWheels.entities.Vehicle;
import org.ncu.hireWheels.repository.BookingRepository;
import org.ncu.hireWheels.repository.LocationRepository;
import org.ncu.hireWheels.repository.UserRepository;
import org.ncu.hireWheels.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	VehicleRepository vehicleRepository;

	@Autowired
	LocationRepository locationRepository;

	@Autowired
	UserRepository userRepository;

	@Override
	public Booking bookVehicle(Booking booking) {
		// TODO Auto-generated method stub
		Vehicle vehicle = vehicleRepository.findById(booking.getBookingVehicle().getVehicleId()).orElse(null);

		if (vehicle != null) {

			booking.setBookingVehicle(vehicle);
			Booking savedBooking = bookingRepository.save(booking);
			return savedBooking;
		} else {
			// Handle the case where the Vehicle with the given ID does not exist
			return null;
		}
	}

	@Override
	public Booking addBooking(Booking booking) {
		
		
		// TODO Auto-generated method stub
		Vehicle vehicle = vehicleRepository.findById(booking.getBookingVehicle().getVehicleId()).orElse(null);
		User user = userRepository.findById(booking.getBookingUser().getUserId()).orElse(null);
		Location location = locationRepository.findById(booking.getBookingLocation().getLocationId()).orElse(null);

		if (vehicle == null || user == null || location == null) {
			return null;
		} else {
			
			Double bookingAmount = booking.getAmount();
			if(user.getWalletMoney()<bookingAmount) {
				 System.out.println("Insufficient Balance. Please Check With Admin");
		            return null;
			}
			user.setWalletMoney(user.getWalletMoney() - bookingAmount);
			booking.setBookingVehicle(vehicle);
			booking.setBookingUser(user);
			booking.setBookingLocation(location);
			Booking bookedVehicle = bookingRepository.save(booking);
//			update user also
			userRepository.save(user);
			return bookedVehicle;
		}

	}

}
