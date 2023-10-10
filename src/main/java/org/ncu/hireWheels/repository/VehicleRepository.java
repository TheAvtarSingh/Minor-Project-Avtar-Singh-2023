package org.ncu.hireWheels.repository;
 
import org.ncu.hireWheels.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Integer>{ 
//	List<Vehicle> findByCategory(VehicleCategory category);

}
