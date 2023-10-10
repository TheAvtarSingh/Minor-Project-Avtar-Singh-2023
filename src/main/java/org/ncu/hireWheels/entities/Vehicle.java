package org.ncu.hireWheels.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vehicle")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_id",precision = 10)
    private Integer vehicleId;

    @Column(name = "vehicle_model", nullable = false, length = 50)
    private String vehicleModel;

    @Column(name = "vehicle_number", nullable = false, length = 10)
    private String vehicleNumber;

     @Column(name = "color", nullable = false, length = 50)
    private String color;

     
    @Column(name = "availability_status", precision = 1, nullable = false)
    private Integer availabilityStatus = 1;

    @Column(name = "vehicle_image_url", nullable = false, length = 500)
    private String vehicleImageUrl;
    
    
    
// Mapping to 
    @ManyToOne(fetch = FetchType.LAZY ,cascade = {CascadeType.ALL})
    @JoinColumn(name = "fuel_type_id", nullable = false)
//    @JsonManagedReference

    private FuelType vehicleFuelType; 
    
    @ManyToOne(fetch = FetchType.LAZY ,cascade = {CascadeType.ALL})
    @JoinColumn(name = "location_id", nullable = false)
//    @JsonManagedReference

    private Location vehicleLocation;
     
    @ManyToOne(fetch = FetchType.LAZY ,cascade = {CascadeType.ALL})
    @JoinColumn(name = "vehicle_subcategory_id")
//    @JsonManagedReference

    private VehicleSubCategory vehicleSubCategory;
	
    
//    Mappings with
	@OneToMany(mappedBy = "bookingVehicle")
	@JsonBackReference
	private List<Booking> vehicle_booking;
    
	@Override
	public String toString() {
		 return "{" +
		            "\nvehicleId=" + vehicleId +
		            "\nvehicleModel='" + vehicleModel + '\'' +
		            "\nvehicleNumber='" + vehicleNumber + '\'' +
		            "\ncolor='" + color + '\'' +
		            "\navailabilityStatus=" + availabilityStatus +
		            "\nvehicleImageUrl='" + vehicleImageUrl + '\'' +
		            "\nlocationId='" + getVehicleLocation().getLocationId() + '\'' +
		            "\nfuelTypeId='" + getVehicleFuelType().getFuelTypeId() + '\'' +
		            "\nvehicleSubCategoryId='" + getVehicleSubCategory().getVehicleSubCategoryId() + '\'' +
		            "\npricePerDay='" + getVehicleSubCategory().getPricePerDay() + '\'' +
		            "\n }";
	}
	
	
}
