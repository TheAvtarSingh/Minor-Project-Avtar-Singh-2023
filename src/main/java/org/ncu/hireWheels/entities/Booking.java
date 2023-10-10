package org.ncu.hireWheels.entities;

import java.sql.Date;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "booking")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "booking_id", precision = 10)
	private Integer bookingId;

	@Column(name = "pickup_date", nullable = false)
	private Date pickupDate;
	@Column(name = "dropoff_date", nullable = false)
	private Date dropoffDate;

	@Column(name = "booking_date", nullable = false)
	private Date bookingDate;
	@Column(name = "amount", nullable = false,   scale = 2)
	private Double amount;

//	Mappings to

	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@JoinColumn(name = "location_id", nullable = true)
	private Location bookingLocation;

	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@JoinColumn(name = "vehicle_id", nullable = true)
	private Vehicle bookingVehicle;

	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@JoinColumn(name = "user_id", nullable = true)
	private User bookingUser;

// Mapped with
	
	@Override
	public String toString() {
	    return " {" +
	            "\nbookingId=" + bookingId +
	            "\npickupDate=" + pickupDate +
	            "\ndropoffDate=" + dropoffDate +
	            "\nbookingDate=" + bookingDate +
	            "\namount=" + amount +
	            "\nbookingLocation=" + bookingLocation.getLocationId() +
	            "\nbookingVehicle=" + bookingVehicle.getVehicleId() +
	            "\nbookingUser=" + bookingUser.getUserId() +
	            "\n}";
	}
	

}
