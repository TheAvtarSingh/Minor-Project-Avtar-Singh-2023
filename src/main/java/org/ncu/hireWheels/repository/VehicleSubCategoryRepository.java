package org.ncu.hireWheels.repository;

import org.ncu.hireWheels.entities.VehicleSubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleSubCategoryRepository extends JpaRepository<VehicleSubCategory, Integer> {

}
