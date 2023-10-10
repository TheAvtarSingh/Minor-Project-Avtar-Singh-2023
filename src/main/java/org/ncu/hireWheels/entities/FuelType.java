package org.ncu.hireWheels.entities;



import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "fuel_type")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FuelType {
	@Id
	@Column(name = "fuel_type_id",precision = 10)
	private Integer fuelTypeId;

	@Column(name = "fuel_type", length = 50,nullable = false)
	private String fuelType;
	
//	Mapped with 
	@OneToMany(mappedBy="vehicleFuelType",fetch = FetchType.LAZY, cascade =  CascadeType.ALL )
	@JsonBackReference
	private List<Vehicle> vehicle;
	
}
