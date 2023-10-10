package org.ncu.hireWheels.repository;

import org.ncu.hireWheels.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
	
//	@Query("SELECT b FROM Booking b WHERE b.vehicle = :vehicle " +
//	           "AND ((b.pickupDate <= :dropoffDate AND b.dropoffDate >= :pickupDate) " +
//	           "OR (b.pickupDate >= :pickupDate AND b.pickupDate <= :dropoffDate))")
//	    List<Booking> findBookingsForVehicleAndDates(
//	        @Param("vehicle") Vehicle vehicle,
//	        @Param("pickupDate") Date pickupDate,
//	        @Param("dropoffDate") Date dropoffDate
//	    );
}
