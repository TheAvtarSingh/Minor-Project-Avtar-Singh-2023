package org.ncu.hireWheels.services;

import org.ncu.hireWheels.entities.Booking;

public interface BookingService {
	public Booking bookVehicle(Booking booking);
	
	public Booking addBooking(Booking booking);
}
