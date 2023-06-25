package com.rentalCarProjectUpdated.car.repository;

import com.rentalCarProjectUpdated.car.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long >, JpaSpecificationExecutor<Car> {

    @Query(nativeQuery = false,name = "Car.Active")
    public List<Car> getCarsByActive();

    @Query(nativeQuery = false,name = "Car.Passive")
    public List<Car> getCarsByPassive();
}
