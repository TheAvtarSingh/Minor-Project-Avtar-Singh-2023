package org.ncu.hireWheels.entities;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vehicle_subcategory")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleSubCategory {

	    @Id
	    @Column(name = "vehicle_subcategory_id", precision = 10)
	    private Integer vehicleSubCategoryId;

	    @Column(name = "vehicle_subcategory_name", nullable = false, unique = true, length = 50)
	    private String vehicleSubCategoryName;

	    @Column(name = "price_per_day", precision = 10, scale = 2, nullable = false)
	    private BigDecimal pricePerDay;
	    
//	    Mapped to 
	     
	    @ManyToOne(fetch = FetchType.LAZY ,cascade = {CascadeType.ALL})
	    @JoinColumn(name = "vehicle_category_id", nullable = false)
//	    @JsonManagedReference
	    private VehicleCategory vehicleSubCategoryVehicleCategory;
	    
//	    Mapped with  
	    @OneToMany(mappedBy = "vehicleSubCategory",fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
	    @JsonBackReference
	    private List<Vehicle> vehicle;

	
	    
}
