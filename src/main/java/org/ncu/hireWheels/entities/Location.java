package org.ncu.hireWheels.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "location")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
	@Id
	@Column(name = "location_id", precision = 10)
	private Integer locationId;

	@Column(name = "location_name", length = 50, nullable = false)
	private String locationName;
	@Column(name = "address", length = 100, nullable = false)
	private String address;
	

	@Column(name = "pincode", length = 6, nullable = false)
	private String pincode;



	
// Mappings to :::  
	@ManyToOne(fetch = FetchType.LAZY ,cascade = {CascadeType.ALL})
	@JoinColumn(name = "city_id", nullable = false)
//	  @JsonManagedReference
	private City locationCity;

	
//	Mappings with : 
	@OneToMany(mappedBy = "vehicleLocation",fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
	@JsonBackReference
	@JsonIgnore
	private List<Vehicle> location_vehicle;
	
	@OneToMany(mappedBy = "bookingLocation")
	@JsonBackReference
	@JsonIgnore
	private List<Booking> location_booking;
	

}
