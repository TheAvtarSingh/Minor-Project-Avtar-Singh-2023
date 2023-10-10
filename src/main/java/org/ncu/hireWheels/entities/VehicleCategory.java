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
@Table(name = "vehicle_category")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleCategory {
	@Id
	@Column(name = "vehicle_category_id",precision = 10)
	public Integer vehicleCategoryId;
	@Column(name = "vehicle_category_name", length = 50, nullable = false, unique = true)
	public String vehicleCategoryName;
	
//	Mapped with 
    @OneToMany(mappedBy = "vehicleSubCategoryVehicleCategory",fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
    @JsonBackReference
    private List<VehicleSubCategory> vehicleCategory_vehicleSubCategory;
}
