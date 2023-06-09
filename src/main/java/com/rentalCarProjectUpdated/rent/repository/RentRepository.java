package com.rentalCarProjectUpdated.rent.repository;

import com.rentalCarProjectUpdated.rent.domain.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RentRepository extends JpaRepository<Rent, Long >, JpaSpecificationExecutor<Rent> {

}