package org.ncu.hireWheels.repository;

import org.ncu.hireWheels.entities.FuelType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelTypeRepository extends JpaRepository<FuelType,	Integer> {

}
