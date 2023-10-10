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
@Table(name = "city")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {
	@Id
	@Column(name = "city_id", precision = 10)
	private Integer cityId;

	@Column(name = "city_name", nullable = false,length = 50)
	private String cityName;
	
//	Mapped to :::
// Mapped With 
	@OneToMany(mappedBy = "locationCity",fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
	@JsonBackReference
	private List<Location> city_location;
}
